INSERT INTO `sectores` (id, nodo_activo, nombre, codigo, ipvirtual) VALUES (1,1,'DESARROLLO SECTOR','006','psisitd006.salud.psis'),
								(2,2,'PROTOTIPO','100','172.25.64.18'),
								(3,4,'DESARROLLO CENTRAL','007','psisitd007.salud.psis'),
								(4,6,'PREPRODUCCION','001','172.25.4.141'),
								(5,27,'CENTRAL','001','172.25.0.141'),
								(6,10,'CLINICO','200','172.25.72.20'),
								(7,31,'BARBASTRO','300','172.25.104.20'),
								(8,13,'SERVET','400','172.25.80.17'),
								(9,32,'TERUEL','500','172.25.112.17'),
								(10,29,'CALATAYUD','600','172.25.88.17'),
								(11,28,'ALCANIZ','700','172.25.120.17'),
								(12,21,'HUESCA','800','172.25.96.17'),
								(13,24,'ROYO','900','172.25.136.17'),
								(14,26,'CSAR','CSAR','172.25.0.142');
								
								
INSERT INTO `nodos` (id, sector_id, host, nombre, variable_global ) VALUES (1,1,'psisitd006','psisitd006.salud.psis','DESARROLLO ITD006'),
								(2,2,'psisitp100','psisitp100.salud.psis','PROTOTIPO ITP100'),
								(3,2,'psisitp101','psisitp101.salud.psis','PROTOTIPO ITP101'),
								(4,3,'psisitd007','psisitd007.salud.psis','DESARROLLO ITD007'),
								(5,4,'psisiti002','psisiti002.salud.psis','PREPRODUCCION ITI002'),
								(6,4,'mez-rhapsody-03','mez-rhapsody-03.salud.psis','PREPRODUCCION 003'),
								(7,5,'psisitp001','psisitp001.salud.psis','CENTRAL ITP001'),
								(8,5,'psisitp003','psisitp003.salud.psis','PRODUCCION ITP003'),
								(9,6,'psisitp200','psisitp200.salud.psis','CLINICO ITP200'),
								(10,6,'mol-rhapsody-201','mol-rhapsody-201.salud.psis','CLINICO 201'),
								(11,7,'psisitp300','psisitp300-ser.salud.psis','BARBASTRO ITP300'),
								(12,7,'psisitp301','psisitp301-ser.salud.psis','BARBASTRO ITP301'),
								(13,8,'psisitp400','psisitp400-ser.salud.psis','SERVET ITP400'),
								(14,8,'mol-rhapsody-401','mol-rhapsody-401.salud.psis','SERVET 401'),
								(15,9,'psisitp500','psisitp500-ser.salud.psis','TERUEL ITP500'),
								(16,9,'psisitp501','psisitp501-ser.salud.psis','TERUEL ITP501'),
								(17,10,'psisitp601','psisitp601-ser.salud.psis','CALATAYUD ITP601'),
								(18,10,'psisitp602','psisitp602.salud.psis','CALATAYUD ITP602'),
								(19,11,'psisitp700','psisitp700-ser.salud.psis','ALCANIZ ITP700'),
								(20,11,'psisitp701','psisitp701-ser.salud.psis','ALCANIZ ITP701'),
								(21,12,'psisitp800','psisitp800-ser.salud.psis','HUESCA ITP800'),
								(22,12,'psisitp801','psisitp801-ser.salud.psis','HUESCA ITP801'),
								(23,13,'psisitp900','psisitp900-ser.salud.psis','ROYO ITP900'),
								(24,13,'psisitp901','psisitp901-ser.salud.psis','ROYO ITP901'),
								(25,14,'psisitp004','psisitp004.salud.psis','CSAR ITP004'),
								(26,14,'psisitp005','psisitp005.salud.psis','CSAR ITP005'),
								(27,5,'moz-rhapsody-03','moz-rhapsody-03.salud.psis','CENTRAL 03'),
								(28,11,'mov-rhapsody-701','mov-rhapsody-701.salud.psis','ALCANIZ 701'),
								(29,10,'mov-rhapsody-601','mov-rhapsody-601.salud.psis','CALATAYUD 601'),
								(30,12,'mov-rhapsody-801','mov-rhapsody-801.salud.psis','HUESCA 801'),
								(31,7,'mov-rhapsody-301','mov-rhapsody-301.salud.psis','BARBASTRO 301'),
								(32,9,'mov-rhapsody-501','mov-rhapsody-501.salud.psis','Teruel 501');