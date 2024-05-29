Create database QLTVD;
use QLTVD;


CREATE TABLE Sach (
    masach CHAR(4) PRIMARY KEY NOT NULL,
    tensach NVARCHAR(50) NOT NULL,
    theloai NVARCHAR(50) NOT NULL,
    nhaxb NVARCHAR(50) NOT NULL,
    namxb CHAR(4) NOT NULL,
    tacgia NVARCHAR(50) NOT NULL,
    vitri CHAR(2) NOT NULL,  
    trangthai BIT NOT NULL, 
    hientrangtruoc CHAR(1) NOT NULL,
	isdelete BIT NOT NULL
);

INSERT INTO Sach (masach, tensach, theloai, nhaxb, namxb, tacgia, vitri, trangthai, hientrangtruoc, isdelete) 
VALUES 
('S000', N'Tiếng Chim Hót Trong Bụi Mận Gai', N'Trinh thám', N'NXB Trẻ', '2010', N'Lê Huy Đức', 'T1', 1, '1', 0),
('S001', N'Chuyện Phố Cổ', N'Văn học', N'NXB Kim Đồng', '1994', N'Đỗ Tiến', 'T2', 0, '1', 0),
('S002', N'Đêm Lang', N'Tiểu thuyết', N'NXB Văn học', '2005', N'Nguyễn Huy Tưởng', 'T3', 1, '1', 0),
('S003', N'Số Đỏ', N'Tiểu thuyết', N'NXB Trẻ', '2012', N'Vũ Trọng Phụng', 'T4', 0, '1', 0),
('S004', N'Tắt Đèn', N'Tiểu thuyết', N'NXB Kim Đồng', '1937', N'Ngô Tất Tố', 'T5', 1, '1', 0),
('S005', N'Lặng Lẽ Sông Don', N'Tiểu thuyết', N'NXB Văn học', '1960', N'Mikhail Sholokhov', 'T5', 0, '1', 0),
('S006', N'Hamlet', N'Kịch', N'NXB Kim Đồng', '1603', N'William Shakespeare', 'T4', 1, '1', 0),
('S007', N'Romeo và Juliet', N'Kịch', N'NXB Văn học', '1597', N'William Shakespeare', 'T3', 0, '1', 0),
('S008', N'Bắt Trẻ Đồng Xanh', N'Tiểu thuyết', N'NXB Trẻ', '1951', N'J.D. Salinger', 'T2', 1, '1', 0),
('S009', N'Nhà Giả Kim', N'Tiểu thuyết', N'NXB Kim Đồng', '1988', N'Paulo Coelho', 'T1', 0, '1', 0),
('S010', N'Hai vạn dặm dưới đáy biển', N'Tiểu thuyết', N'NXB Văn học', '1870', N'Jules Verne', 'T1', 1, '1', 0),
('S011', N'Chiến tranh và Hòa bình', N'Tiểu thuyết', N'NXB Kim Đồng', '1869', N'Lev Tolstoy', 'T2', 0, '1', 0),
('S012', N'Tội ác và trừng phạt', N'Tiểu thuyết', N'NXB Văn học', '1866', N'Fyodor Dostoevsky', 'T3', 1, '1', 0),
('S013', N'Anna Karenina', N'Tiểu thuyết', N'NXB Kim Đồng', '1878', N'Lev Tolstoy', 'T1', 0, '1', 0),
('S014', N'Những kẻ khốn cùng', N'Tiểu thuyết', N'NXB Văn học', '1862', N'Victor Hugo', 'T5', 1, '1', 0),
('S015', N'Thuốc phiện', N'Tiểu thuyết', N'NXB Kim Đồng', '1860', N'Tự Lập', 'T5', 0, '1', 0),
('S016', N'Chí Phèo', N'Tiểu thuyết', N'NXB Văn học', '1936', N'Nam Cao', 'T4', 1, '1', 0),
('S017', N'Số phận con người', N'Truyện ngắn', N'NXB Kim Đồng', '1959', N'Mikhail Sholokhov', 'T3', 0, '1', 0),
('S018', N'Lặng lẽ sau chiến tranh', N'Truyện ngắn', N'NXB Văn học', '1972', N'Lê Lựu', 'T2', 1, '1', 0),
('S019', N'Đôi mắt người mẹ', N'Truyện ngắn', N'NXB Kim Đồng', '1959', N'Nguyễn Quang Sáng', 'T1', 0, '1', 0),
('S020', N'Buổi sáng của lăng Cô', N'Thơ', N'NXB Văn học', '1938', N'Hồ Xuân Hương', 'T5', 1, '1', 0),
('S021', N'Từ ấy', N'Thơ', N'NXB Kim Đồng', '1938', N'Hồ Xuân Hương', 'T4', 1, '1', 0),
('S022', N'Ngẫu hứng', N'Thơ', N'NXB Văn học', '1939', N'Nguyễn Du', 'T3', 0, '1', 0),
('S023', N'Cảnh Đoàn thuyền', N'Thơ', N'NXB Kim Đồng', '1945', N'Nguyễn Trãi', 'T2', 0, '1', 0),
('S024', N'Qua Đèo Ngang', N'Thơ', N'NXB Văn học', '1802', N'Bà Huyện Thanh Quan', 'T1', 1, '1', 0),
('S025', N'Viếng Lăng Bác', N'Thơ', N'NXB Văn học', '1976', N'Viễn Phương', 'T5', 0, '1', 0),
('S026', N'Nhớ Rừng', N'Thơ', N'NXB Văn học', '1942', N'Muội Trần', 'T4', 1, '1', 0),
('S027', N'Về thăm nhà bác', N'Thơ', N'NXB Kim Đồng', '1959', N'Tố Hữu', 'T3', 0, '1', 0),
('S028', N'Mẹ Tơm', N'Thơ', N'NXB Văn học', '1968', N'Hồ Xuân Hương', 'T2', 1, '1', 0),
('S029', N'Con cò', N'Ca dao', N'NXB Kim Đồng', '1960', N'Tác giả dân gian', 'T1', 0, '1', 0),
('S030', N'Áo mùa thu', N'Ca dao', N'NXB Văn học', '1972', N'Tác giả dân gian', 'T2', 1, '1', 0),
('S031', N'Bèo dạt mây trôi', N'Ca dao', N'NXB Kim Đồng', '1957', N'Tác giả dân gian', 'T3', 0, '1', 0),
('S032', N'Đi cấy', N'Ca dao', N'NXB Văn học', '1979', N'Tác giả dân gian', 'T4', 1, '1', 0),
('S033', N'Trên đồng cạn', N'Ca dao', N'NXB Kim Đồng', '1960', N'Tác giả dân gian', 'T5', 0, '1', 0),
('S034', N'Cây đa bến nước', N'Ca dao', N'NXB Văn học', '1980', N'Tác giả dân gian', 'T4', 1, '1', 0),
('S035', N'Gánh lúa', N'Ca dao', N'NXB Kim Đồng', '1975', N'Tác giả dân gian', 'T3', 0, '1', 0),
('S036', N'Làng quê', N'Ca dao', N'NXB Văn học', '1990', N'Tác giả dân gian', 'T2', 1, '1', 0),
('S037', N'Kiều', N'Truyện thơ', N'NXB Kim Đồng', '1802', N'Nguyễn Du', 'T1', 0, '1', 0),
('S038', N'Chí Phèo', N'Tiểu thuyết', N'NXB Văn học', '1936', N'Nam Cao', 'T2', 1, '1', 0),
('S039', N'Số đỏ', N'Tiểu thuyết', N'NXB Kim Đồng', '1937', N'Vũ Trọng Phụng', 'T3', 0, '1', 0);



Create table Docgia(
madg char(4) primary key not null, 
tendg nvarchar(50) not null,
sdt char(10) not null,
email nvarchar(50) not null
);
INSERT INTO Docgia (madg, tendg, sdt, email) 
VALUES 
('DG01', N'Nguyễn Văn Hùng', '0123456789', N'nguyenvana@example.com'),
('DG02', N'Trần Thị Lan', '0987654321', N'tranthilan@example.com'),
('DG03', N'Lê Văn Toàn', '0123456789', N'levantoan@example.com'),
('DG04', N'Phạm Thị Mai', '0987654321', N'phamthimai@example.com'),
('DG05', N'Vũ Kim Ngân', '0123456789', 'vukimngan@example.com'),
('DG06', N'Đinh Minh Quân', '0987654321', N'dinhminhquan@example.com'),
('DG07', N'Nguyễn Thị Hoa', '0123456789', N'nguyenthihoa@example.com'),
('DG08', N'Lê Văn Nam', '0987654321', N'levannam@example.com'),
('DG09', N'Phạm Thị Ánh', '0123456789', N'phamthianh@example.com'),
('DG10', N'Vũ Kim Chi', '0987654321', N'vukimchi@example.com'),
('DG11', N'Đinh Thị Thúy', '0123456789', N'dinhthithuy@example.com'),
('DG12', N'Nguyễn Văn Minh', '0987654321', N'nguyenvanminh@example.com'),
('DG13', N'Lê Thị Hòa', '0123456789', N'lethihoa@example.com'),
('DG14', N'Phạm Minh Đức', '0987654321', N'phamminhduc@example.com'),
('DG15', N'Vũ Kim Dung', '0123456789', N'vukimdung@example.com'),
('DG16', N'Đinh Thị Trang', '0987654321', N'dinhthitrang@example.com'),
('DG17', N'Nguyễn Thị Ngọc', '0123456789', N'nguyenthingoc@example.com'),
('DG18', N'Lê Văn Tuấn', '0987654321', N'levantuan@example.com'),
('DG19', N'Phạm Thị Thanh', '0123456789', N'phamthithanh@example.com'),
('DG20', N'Vũ Kim Oanh', '0987654321', N'vukimoanh@example.com'),
('DG21', N'Trần Thị Hồng', '0123456789', 'tranthihong@example.com'),
('DG22', N'Lê Văn Hiếu', '0987654321', 'levanhieu@example.com'),
('DG23', N'Phạm Thị Xuân', '0123456789', 'phamthixuan@example.com'),
('DG24', N'Vũ Kim Linh', '0987654321', 'vukimlinh@example.com'),
('DG25', N'Đinh Minh Hằng', '0123456789', N'dinhminhhang@example.com'),
('DG26', N'Nguyễn Thị My', '0987654321', N'nguyenthimy@example.com'),
('DG27', N'Lê Văn Khánh', '0123456789', N'levankhanh@example.com'),
('DG28', N'Phạm Minh Tuấn', '0987654321', N'phamminhtu@example.com'),
('DG29', N'Vũ Kim Ánh', '0123456789', N'vukimanh@example.com'),
('DG30', N'Đinh Thị Lệ', '0987654321', N'dinhthile@example.com'),
('DG31', N'Nguyễn Văn Thành', '0123456789', N'nguyenvanthanh@example.com'),
('DG32', N'Lê Thị Trang', '0987654321', N'lethitrang@example.com'),
('DG33', N'Phạm Thị Lan Anh', '0123456789', N'phamthilananh@example.com'),
('DG34', N'Vũ Kim Hằng', '0987654321', N'vukimhang@example.com'),
('DG35', N'Đinh Minh Hiếu', '0123456789', N'dinhminhhieu@example.com'),
('DG36', N'Nguyễn Thị Lụa', '0987654321', N'nguyenthilua@example.com'),
('DG37', N'Lê Văn Duy', '0123456789', N'levantuy@example.com'),
('DG38', N'Phạm Minh Khánh', '0987654321', N'phamminhkhanh@example.com'),
('DG39', N'Vũ Kim Trang', '0123456789', N'vukimtrang@example.com'),
('DG40', N'Đinh Thị Thảo', '0987654321', N'dinhthithao@example.com'),
('DG41', N'Nguyễn Thị Mai', '0987654321', N'nguyenthimai@example.com'),
('DG42', N'Trần Văn Trọng', '0987654321', N'tranvantrong@example.com'),
('DG43', N'Lê Thị Lan', '0987654321', N'lethilan@example.com'),
('DG44', N'Phạm Trọng Minh', '0987654321', N'phamtrongminh@example.com'),
('DG45', N'Võ Thị Hương', '0987654321', N'vothihung@example.com'),
('DG46', N'Đinh Minh Tiến', '0987654321', N'dinhminhtien@example.com'),
('DG47', N'Lý Thị Mai', '0987654321', N'lythimai@example.com'),
('DG48', N'Bùi Văn Anh', '0987654321', N'buivananh@example.com'),
('DG49', N'Đào Thị Tuyết', '0987654321', N'daothituyet@example.com'),
('DG50', N'Huỳnh Văn Minh', '0987654321', N'huynvanminh@example.com'),
('DG51', N'Nguyễn Thị Lan', '0987654321', N'nguyenthilan@example.com'),
('DG52', N'Trần Văn Trọng', '0987654321', N'tranvantrong@example.com'),
('DG53', N'Nguyễn Thị Mai', '0987654322', N'nguyenthimai@example.com'),
('DG54', N'Lê Văn An', '0987654323', N'levanan@example.com'),
('DG55', N'Phạm Thị Hoa', '0987654324', N'phamthihoa@example.com'),
('DG56', N'Hoàng Minh Đức', '0987654325', N'hoangminhduc@example.com'),
('DG57', N'Đỗ Thị Bích', '0987654326', N'dothibich@example.com'),
('DG58', N'Phan Văn Nam', '0987654327', N'phanvannam@example.com'),
('DG59', N'Ngô Thị Lan', '0987654328', N'ngothilan@example.com'),
('DG60', N'Vũ Văn Toàn', '0987654329', N'vuvantoan@example.com');
Create table PMT(
maphieu char(4) primary key not null, 
madg char(4) not null,
ngaylap date not null,
hantra date not null, 
);
Alter table PMT 
ADD constraint KPMT
foreign key (madg) references Docgia(madg)
UPDATE PMT
SET hantra = DATEADD(MONTH, 5, ngaylap);
INSERT INTO PMT (maphieu, madg, ngaylap, hantra) VALUES
('P001', 'DG01', '2000-09-01', '2001-02-01'),
('P002', 'DG02', '2023-09-09', '2024-02-09'),
('P003', 'DG03', '2023-08-14', '2024-01-14'),
('P004', 'DG04', '2023-07-19', '2023-12-19'),
('P005', 'DG06', '2023-06-24', '2023-11-24'),
('P006', 'DG06', '2023-05-29', '2023-10-29'),
('P007', 'DG07', '2023-05-04', '2023-10-04'),
('P008', 'DG08', '2023-04-09', '2023-09-09'),
('P009', 'DG09', '2023-03-14', '2023-08-14'),
('P010', 'DG10', '2023-02-19', '2023-07-19'),
('P011', 'DG10', '2023-01-24', '2023-06-24'),
('P012', 'DG10', '2022-12-29', '2023-05-29'),
('P013', 'DG13', '2022-11-24', '2023-04-24'),
('P014', 'DG14', '2022-10-19', '2023-03-19'),
('P015', 'DG15', '2022-09-14', '2023-02-14'),
('P016', 'DG16', '2022-08-09', '2023-01-09'),
('P017', 'DG10', '2022-07-04', '2022-12-04'),
('P018', 'DG18', '2022-06-29', '2022-11-29'),
('P019', 'DG19', '2022-05-24', '2022-10-24'),
('P020', 'DG20', '2022-04-19', '2022-09-19'),
('P021', 'DG21', '2023-03-24', '2023-08-24'),
('P022', 'DG22', '2023-02-19', '2023-07-19'),
('P023', 'DG23', '2023-01-24', '2023-06-24'),
('P024', 'DG20', '2022-12-29', '2023-05-29'),
('P025', 'DG20', '2022-11-24', '2023-04-24'),
('P026', 'DG26', '2022-10-19', '2023-03-19'),
('P027', 'DG27', '2022-09-14', '2023-02-14'),
('P028', 'DG26', '2022-08-09', '2023-01-09'),
('P029', 'DG29', '2022-07-04', '2022-12-04'),
('P030', 'DG30', '2022-06-29', '2022-11-29'),
('P031', 'DG31', '2022-05-24', '2022-10-24'),
('P032', 'DG32', '2022-04-19', '2022-09-19'),
('P033', 'DG33', '2023-10-09', '2024-03-09'),
('P034', 'DG34', '2023-09-14', '2024-02-14'),
('P035', 'DG35', '2023-08-19', '2024-01-19'),
('P036', 'DG02', '2023-07-24', '2023-12-24'),
('P037', 'DG37', '2023-06-29', '2023-11-29'),
('P038', 'DG38', '2023-05-24', '2023-10-24'),
('P039', 'DG10', '2023-04-19', '2023-09-19'),
('P040', 'DG40', '2023-03-24', '2023-08-24'),
('P041', 'DG41', '2023-01-01', '2023-06-01'),
('P042', 'DG42', '2023-02-01', '2023-07-01'),
('P043', 'DG43', '2023-03-01', '2023-08-01'),
('P044', 'DG44', '2023-04-01', '2023-09-01'),
('P045', 'DG45', '2023-05-01', '2023-10-01'),
('P046', 'DG46', '2023-06-01', '2023-11-01'),
('P047', 'DG47', '2023-07-01', '2023-12-01'),
('P048', 'DG48', '2023-08-01', '2024-01-01'),
('P049', 'DG49', '2023-09-01', '2024-02-01'),
('P050', 'DG50', '2023-10-01', '2024-03-01'),
('P051', 'DG51', '2023-11-01', '2024-04-01'),
('P052', 'DG52', '2023-12-01', '2024-05-01'),
('P053', 'DG53', '2024-01-01', '2024-05-28'),
('P054', 'DG54', '2024-01-15', '2024-05-28'),
('P055', 'DG55', '2024-02-01', '2024-05-28'),
('P056', 'DG56', '2024-02-15', '2024-05-28'),
('P057', 'DG57', '2024-03-01', '2024-05-28'),
('P058', 'DG58', '2024-03-15', '2024-05-28'),
('P059', 'DG59', '2024-04-01', '2024-05-28'),
('P060', 'DG60', '2024-04-15', '2024-05-28');



Create table ChitietMT(
masach char(4) not null,
maphieu char(4) not null,
ngaytra date,
hientrangmuon char(1) not null,
hientrangsau char(1),
Primary key (masach, maphieu),
foreign key (masach) references Sach(masach),
foreign key (maphieu) references PMT(maphieu)
);
INSERT INTO ChitietMT (masach, maphieu, ngaytra, hientrangmuon, hientrangsau) VALUES
('S000', 'P001', '2001-03-01', '1', '2'),
('S001', 'P002', '2024-03-09', '1', '4'),
('S002', 'P003', '2024-02-14', '1', '3'),
('S003', 'P004', '2024-01-19', '1', '1'),
('S004', 'P005', '2023-12-24', '1', '4'),
('S005', 'P006', '2023-11-29', '1', '2'),
('S006', 'P007', '2023-11-04', '1', '3'),
('S007', 'P008', '2023-10-09', '1', '1'),
('S008', 'P009', '2023-09-14', '1', '4'),
('S009', 'P010', '2023-08-19', '1', '2'),
('S010', 'P011', '2023-07-24', '1', '3'),
('S011', 'P012', '2023-06-29', '1', '1'),
('S012', 'P013', '2023-05-24', '1', '4'),
('S013', 'P014', '2023-04-19', '1', '2'),
('S014', 'P015', '2023-03-14', '1', '3'),
('S015', 'P016', '2023-02-09', '1', '1'),
('S016', 'P017', '2023-01-04', '1', '4'),
('S017', 'P018', '2022-12-29', '1', '2'),
('S018', 'P019', '2022-11-24', '1', '3'),
('S019', 'P020', '2022-10-19', '1', '1'),
('S015', 'P020', '2022-09-19', '1', '3'),
('S007', 'P021', '2023-08-24', '1', '2'),
('S019', 'P022', '2023-07-19', '1', '1'),
('S023', 'P023', '2023-06-24', '1', '4'),
('S003', 'P024', '2023-05-29', '1', '2'),
('S011', 'P025', '2023-04-24', '1', '3'),
('S001', 'P026', '2023-03-19', '1', '4'),
('S034', 'P027', '2023-02-14', '1', '1'),
('S022', 'P028', '2023-01-09', '1', '2'),
('S018', 'P029', '2022-12-04', '1', '3'),
('S036', 'P030', '2022-11-29', '1', '4'),
('S024', 'P031', '2022-10-24', '1', '2'),
('S005', 'P032', '2022-09-19', '1', '1'),
('S030', 'P033', '2024-03-09', '1', '3'),
('S038', 'P034', '2024-02-14', '1', '4'),
('S009', 'P035', '2024-01-19', '1', '1'),
('S021', 'P036', '2023-12-24', '1', '2'),
('S014', 'P037', '2023-11-29', '1', '3'),
('S027', 'P038', '2023-10-24', '1', '4'),
('S039', 'P039', '2023-09-19', '1', '1'),
('S016', 'P040', '2023-08-24', '1', '2'),
('S012', 'P041', '2023-06-01', '2', '4'),
('S028', 'P042', '2023-07-01', '3', '4'),
('S035', 'P043', '2023-08-01', '2', '3'),
('S006', 'P044', '2023-09-01', '3', '3'),
('S013', 'P045', '2023-10-01', '2', '2'),
('S029', 'P046', '2023-11-01', '3', '4'),
('S017', 'P047', '2023-12-01', '4', '4'),
('S004', 'P048', '2024-01-01', '2', '3'),
('S031', 'P049', '2024-02-01', '3', '3'),
('S008', 'P050', '2024-03-01', '2', '4'),
('S020', 'P051', '2023-11-01', '2', '3'),
('S021', 'P052', '2023-12-01', '1', '1'),
('S022', 'P053', '2024-01-01', '2', '2'), 
('S023', 'P054', '2024-01-15', '3', '3'), 
('S024', 'P055', '2024-02-01', '4', '4'), 
('S025', 'P056', '2024-02-15', '2', '2'), 
('S026', 'P057', '2024-03-01', '3', '3'), 
('S027', 'P058', '2024-03-15', '4', '4'), 
('S028', 'P059', '2024-04-01', '2', '2'), 
('S029', 'P060', '2024-04-15', '3', '4'); 








-- Theo tháng
SELECT MONTH(ChitietMT.ngaytra) AS Thang, COUNT(*) AS SoLuotTraSach
FROM ChitietMT
GROUP BY MONTH(ChitietMT.ngaytra)
ORDER BY Thang;

-- Theo quý
SELECT DATEPART(QUARTER, ChitietMT.ngaytra) AS Quy, COUNT(*) AS SoLuotTraSach
FROM ChitietMT
GROUP BY DATEPART(QUARTER, ChitietMT.ngaytra)
ORDER BY Quy;

-- Theo năm
SELECT YEAR(ChitietMT.ngaytra) AS Nam, COUNT(*) AS SoLuotTraSach
FROM ChitietMT
GROUP BY YEAR(ChitietMT.ngaytra)
ORDER BY Nam;
-- Theo từng độc giả
SELECT Docgia.tendg, COUNT(*) AS SoLuotMuon
FROM PMT 
JOIN Docgia ON PMT.madg = Docgia.madg
GROUP BY Docgia.tendg
ORDER BY SoLuotMuon DESC;
-- Theo thể loại
SELECT Sach.theloai, COUNT(*) AS SoLuotMuon
FROM ChitietMT
JOIN Sach ON ChitietMT.masach = Sach.masach
GROUP BY Sach.theloai
ORDER BY SoLuotMuon DESC;
-- Sách hỏng > 50
SELECT Sach.masach, Sach.tensach, Sach.hientrangtruoc
FROM Sach
WHERE Sach.hientrangtruoc > '2'
-- Sách hỏng > 75 cần thay thế (Hay còn gọi là sách cần thay mới)
SELECT Sach.masach, Sach.tensach, Sach.hientrangtruoc
FROM Sach
WHERE Sach.hientrangtruoc > '3'
-- thể loại được mượn nhiều nhất
SELECT Sach.theloai, COUNT(*) AS SoLuotMuon
FROM ChitietMT
JOIN Sach ON ChitietMT.masach = Sach.masach
GROUP BY Sach.theloai
ORDER BY SoLuotMuon DESC
OFFSET 0 ROWS FETCH NEXT 1 ROW ONLY;

-- Sách được mượn nhiều nhất
SELECT Sach.tensach, COUNT(*) AS SoLuotMuon
FROM ChitietMT
JOIN Sach ON ChitietMT.masach = Sach.masach
GROUP BY Sach.tensach
ORDER BY SoLuotMuon DESC
OFFSET 0 ROWS FETCH NEXT 1 ROW ONLY;

