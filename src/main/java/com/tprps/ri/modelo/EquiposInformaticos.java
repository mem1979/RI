package com.tprps.ri.modelo;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.annotations.File;
import org.openxava.model.*;

import com.google.zxing.*;
import com.google.zxing.client.j2se.*;
import com.google.zxing.common.*;
import com.tprps.ri.Enums.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members=
    "general [" +
    "sector;" +
    "usuarios;" +
    "tipo, estado;" +
    "]" +
    "foto;" +
    "DATOS {#" +
    "nombreNetBios, macAddress;" +
    "marca, modelo;" +
    "numeroSerie, numeroSigaf;" +
    "observación, codigoQR}" +
    "HARDWARE {" +
    "summary; documento}" +
    "HISTORIAL {}"
)
@Tab(
    rowStyles=@RowStyle(style="row-highlight", property="estado", value="MALO"),
    properties="sector.area, sector.sector, usuarios, marca, modelo, numeroSerie, estado, tipo"
)
public class EquiposInformaticos extends Identifiable {

    @Column(length = 50)
    @NotBlank(message = "El nombre NetBIOS es obligatorio")
    @DisplaySize(30)
    private String nombreNetBios; // Nombre NetBIOS del equipo

    @MAC
    @DisplaySize(30)
    private String macAddress; // Dirección MAC del equipo

    @Column(length = 50)
    @NotBlank(message = "El usuario es obligatorio")
    @DisplaySize(30)
    private String usuarios; // Usuario asociado al equipo

    @Column(length = 50)
    @DisplaySize(30)
    private String marca; // Marca del equipo

    @Column(length = 50)
    @DisplaySize(30)
    private String modelo; // Modelo del equipo

    @Column(length = 50)
    @DisplaySize(30)
    private String numeroSerie; // Número de serie del equipo

    @Column(length = 50)
    @DisplaySize(30)
    private String numeroSigaf; // Número SIGAF del equipo

    @Column(length = 50)
    @DisplaySize(30)
    private String tipo; // Tipo del equipo

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    @NotNull(message = "El estado es obligatorio")
    @DisplaySize(30)
    private Estado estado; // Estado del equipo (BUENO, MALO, etc.)

    @File
    @Column(length=32)
    private String documento; // Documento asociado al equipo

    @TextArea
    @Column(length = 600)
    private String summary; // Resumen de los detalles del equipo

    @TextArea
    private String observación; // Observaciones sobre el equipo

    @Lob
    @ReadOnly
    @Stereotype("IMAGEN")
    @Column(length=500000)
    private byte[] codigoQR; // Código QR del equipo

    @File
    @Column(length=32)
    private String foto; // Foto del equipo

    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="area, sector")
    private Sectores sector; // Sector asociado al equipo

    @PrePersist @PostUpdate
    private void generarCodigoQR() {
        try {
            String textoQR = "Equipo Informatico: " + summary;
            BitMatrix matrix = new MultiFormatWriter().encode(textoQR, BarcodeFormat.QR_CODE, 200, 200);
            BufferedImage image = MatrixToImageWriter.toBufferedImage(matrix);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            this.codigoQR = baos.toByteArray();
        } catch (WriterException | IOException e) {
            throw new RuntimeException("Error generando código QR", e);
        }
    }
}
