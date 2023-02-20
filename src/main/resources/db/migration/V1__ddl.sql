/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  nurzaenudin
 * Created: Feb 20, 2023
 */

CREATE TABLE public.agenda (
	id bigserial NOT NULL,
	cek_fisik varchar(255) NULL,
	keterangan varchar(255) NULL,
	nama_biro varchar(255) NULL,
	namappk varchar(255) NULL,
	nilai_bersih int8 NULL,
	nilai_kotor int8 NULL,
	nilai_pajak int8 NULL,
	nomor_drpp int8 NULL,
	nomor_spp int8 NULL,
	status varchar(255) NULL,
	tanggal_bayar varchar(255) NULL,
	CONSTRAINT agenda_pkey PRIMARY KEY (id)
);

CREATE TABLE public.perintah_bayar (
	id bigserial NOT NULL,
	harga_satuan int8 NULL,
	jumlah int8 NULL,
	keterangan varchar(255) NULL,
	nama_pic varchar(255) NULL,
	nama_rekanan varchar(255) NULL,
	nilai_bersih int8 NULL,
	nilai_kotor int8 NULL,
	nomor_drpp int8 NULL,
	nomor_kuitansi int8 NULL,
	nomor_perintah_bayar int8 NULL,
	pph21 int8 NULL,
	pph22 int8 NULL,
	pph23 int8 NULL,
	pph_final int8 NULL,
	ppn int8 NULL,
	status varchar(255) NULL,
	total_pajak int8 NULL,
	CONSTRAINT perintah_bayar_pkey PRIMARY KEY (id)
);