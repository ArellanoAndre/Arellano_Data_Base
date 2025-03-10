#Base de Datos Creación .................
Create database VentasArellano;
use VentasArellano;
#Tablas .................................
CREATE TABLE `tblVentaDetalle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idVenta` int(11) DEFAULT NULL,
  `codigoProducto` varchar(50) DEFAULT NULL,
  `talla` int(11) DEFAULT NULL,
  `color` int(11) DEFAULT NULL,
  `precio` decimal(10,6) DEFAULT NULL,
  `descuento` decimal(10,6) DEFAULT NULL,
  `descuentoxy` tinyint(4) DEFAULT NULL,
  `cantidad` decimal(10,2) DEFAULT NULL,
  `emprendedor` varchar(4) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);
CREATE TABLE `tblVentasEncabezado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `sessionId` varchar(45) DEFAULT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  `formaPago` varchar(45) DEFAULT NULL,
  `efectivo` decimal(10,2) DEFAULT NULL,
  `tarjeta` decimal(10,2) DEFAULT NULL,
  `transferencia` decimal(10,2) DEFAULT NULL,
  `giftCard` decimal(10,2) DEFAULT NULL,
  `cambio` decimal(10,2) DEFAULT NULL,
  `referenciaBancaria` varchar(150) DEFAULT NULL,
  `tel_email` varchar(150) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  `fechaCancelacion` datetime DEFAULT NULL,
  `apartado` tinyint(4) DEFAULT NULL,
  `envio` decimal(10,2) DEFAULT NULL,
  `cargo` int(11) DEFAULT NULL,
  `idVentaDevolucion` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
# Registros .........................................
INSERT INTO `tblVentaDetalle` (`id`, `idVenta`, `codigoProducto`, `talla`, `color`, `precio`, `descuento`, `descuentoxy`, `cantidad`, `emprendedor`, `descripcion`, `status`) 
VALUES
(15541,5027,'MIESE104',0,0,90.000000,0.000000,NULL,1.00,'3106','LLAVERO CUARZO',1),
(15542,5028,'KWM22',0,0,6.000000,0.000000,NULL,4.00,'1727','STICKERS',1),
(15543,5028,'PCT6',0,0,20.000000,0.000000,NULL,2.00,'0301','ROLL ON DULCES SUEÑOS PROMO',1),
(15544,5029,'LLP512',0,0,150.000000,10.000000,NULL,1.00,'3106','ARETES DE PLATA',1),
(15545,5030,'HWB22',0,0,25.000000,0.000000,NULL,3.00,'1727','VELA AROMÁTICA',1),
(15546,5031,'ZXC321',0,0,50.000000,5.000000,NULL,2.00,'0301','PULSERA ROJA',1),
(15547,5032,'LTS654',0,0,300.000000,20.000000,NULL,1.00,'3106','ANILLO PLATA',1),
(15548,5033,'ABCD12',0,0,15.000000,0.000000,NULL,5.00,'1727','SOUVENIR LLAVERO',1),
(15549,5034,'JLK789',0,0,12.000000,0.000000,NULL,3.00,'0301','ACEITE ESENCIAL',1),
(15550,5035,'MIESE105',0,0,100.000000,5.000000,NULL,2.00,'3106','COLLAR CUARZO',1),
(15551,5036,'KWM23',0,0,8.000000,0.000000,NULL,4.00,'1727','STICKERS DISEÑO',1),
(15552,5037,'PCT7',0,0,22.000000,0.000000,NULL,1.00,'0301','ROLL ON RELAJANTE',1),
(15553,5038,'LLP513',0,0,120.000000,15.000000,NULL,1.00,'3106','ARETES ORO',1),
(15554,5039,'HWB23',0,0,30.000000,0.000000,NULL,2.00,'1727','VELA VAINILLA',1),
(15555,5040,'ZXC322',0,0,55.000000,5.000000,NULL,1.00,'0301','PULSERA NEGRA',1),
(15556,5041,'LTS655',0,0,250.000000,15.000000,NULL,1.00,'3106','CADENA PLATA',1),
(15557,5042,'ABCD13',0,0,20.000000,0.000000,NULL,5.00,'1727','SOUVENIR ANILLO',1),
(15558,5043,'JLK790',0,0,18.000000,0.000000,NULL,3.00,'0301','ACEITE MENTA',1),
(15559,5044,'MIESE106',0,0,110.000000,5.000000,NULL,2.00,'3106','COLLAR ONIX',1),
(15560,5045,'PCT8',0,0,23.000000,0.000000,NULL,1.00,'0301','ROLL ON CALMA',1);

INSERT INTO `tblVentasEncabezado` 
(`id`, `fecha`, `sessionId`, `monto`, `formaPago`, `efectivo`, `tarjeta`, `transferencia`, `giftCard`, `cambio`, `referenciaBancaria`, `tel_email`, `cliente`, `fechaCancelacion`, `apartado`, `envio`, `cargo`, `idVentaDevolucion`, `status`)  
VALUES
(5027,'2025-03-10 10:30:00','A1B2C3',800.00,'Efectivo',800.00,0.00,0.00,0.00,0.00,NULL,'cliente1@gmail.com',1,NULL,0,50,0,NULL,1),
(5028,'2025-03-10 11:00:00','A1B2C4',1200.00,'Tarjeta',0.00,1200.00,0.00,0.00,0.00,'123ABC','cliente2@gmail.com',2,NULL,0,30,0,NULL,1),
(5029,'2025-03-10 12:30:00','A1B2C5',1500.00,'Transferencia',0.00,0.00,1500.00,0.00,0.00,'456DEF','cliente3@gmail.com',3,NULL,0,40,0,NULL,1),
(5030,'2025-03-10 14:00:00','A1B2C6',750.00,'Efectivo',750.00,0.00,0.00,0.00,0.00,NULL,'cliente4@gmail.com',4,NULL,0,20,0,NULL,1),
(5031,'2025-03-10 16:00:00','A1B2C7',2000.00,'Tarjeta',0.00,2000.00,0.00,0.00,0.00,'789GHI','cliente5@gmail.com',5,NULL,0,60,0,NULL,1);

# SP ------------------------------------------------
DELIMITER $$

-- 1) Regrese todos los campos de la tabla tblVentaDetalle filtrado por el idVenta
CREATE PROCEDURE SP_OBTENER_VENTA_POR_ID(IN p_idVenta INT)
BEGIN
    SELECT * FROM tblVentaDetalle WHERE idVenta = p_idVenta;
END $$

-- 2) Regresar el número de ventas de una fecha
CREATE PROCEDURE SP_OBTENER_VENTAS_POR_FECHA(IN p_fecha DATE)
BEGIN
    SELECT COUNT(*) AS totalVentas FROM tblVentasEncabezado 
    WHERE DATE(fecha) = p_fecha;
END $$

-- 3) Regresar campos específicos de tblVentasEncabezado y tblVentaDetalle
CREATE PROCEDURE SP_OBTENER_VENTAS_ENCABEZADO()
BEGIN
    SELECT e.id, e.fecha, d.codigoProducto, d.precio, d.cantidad
    FROM tblVentasEncabezado e
    INNER JOIN tblVentaDetalle d ON e.id = d.idVenta;
END $$

-- 4) Ventas canceladas (status = 0)
CREATE PROCEDURE SP_OBTENER_VENTAS_CANCELADAS ()
BEGIN
    SELECT * FROM tblVentasEncabezado 
    WHERE status = 0;
END $$

-- 5) Listado de productos vendidos en un mes y por emprendedor
CREATE PROCEDURE SP_OBTENER_PRODUCTOS_POR_MES_Y_EMPRENDEDOR(IN p_mes INT, IN p_emprendedor VARCHAR(4))
BEGIN
    SELECT * FROM tblVentaDetalle
    WHERE MONTH((SELECT fecha FROM tblVentasEncabezado WHERE id = tblVentaDetalle.idVenta)) = p_mes
    AND emprendedor = p_emprendedor;
END $$

DELIMITER ;
