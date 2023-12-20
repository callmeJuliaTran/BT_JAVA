package Project_ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class taikhoan_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xây dựng một lớp biểu diễn tài khoản ngân hàng với 2 thành phần dữliệu là họtên và sốdư. 
//		0 Nhập n tài khoản
//		1 cho phép hiển thịhọtên và sốdư của tài khoản,
//		2 nạp tiền vào tài khoản,
//		3 rút tiền ra khỏi tài khoản
//		4 chuyen tien
//		5 phan quyen ( 1.admin 2.user)
//
//		Khi nạp  tiền vào tài khoản thì  sốtiền nạp ít  nhất là 5000. Nếu nạp  sốtiền ít hơn 5000 
//		thì ra thông báo “Không nạp tiền”và sốdư không đổi.Khi rút tiền ra khỏi tài khoản 
//		thì sốtiền rút ít nhất là 2000 và sốdư tài khoản phải lớn hơn hoặc bằng sốtiền rút.
//		 Nếu không rút được thì ra thông báo “Không rút tiền”và sốdư không đổi.
		Scanner scanner = new Scanner(System.in);
		Map<String, taikhoan> map = new HashMap<>();
		System.out.print("Nhap so luong tai khoan");
		int n = scanner.nextInt();
		int kt = 1;
		int nhapso = 0;
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.print("Nhap ho ten dang ky");
			String ten = scanner.nextLine();
			System.out.print("Set ma pin");
			int mapin = scanner.nextInt();
			System.out.print("Confirm ma pin");
			int confirmmapin = scanner.nextInt();
			if (mapin != confirmmapin) {
				kt = 0;
				break;
			}
			System.out.print("Nhap 1 neu la admin, nhap 2 neu la khach hang");
			int quyen = scanner.nextInt();
			System.out.println("Nap tien de kich hoat tai khoan, so tien nap it nhat 50 la phi duy tri tai khoan");
			int sodu = scanner.nextInt();
			if (sodu < 50) {
				kt = 2;
				break;
			}
			map.put(ten, new taikhoan(ten, mapin, sodu, quyen));
		}

		if (kt == 0) {
			System.out.println("Ma pin k trung khop");
		} else if (kt == 2) {
			System.out.println("Tien khong du de duy tri tai khoan");
		} else {

			Set<String> set = map.keySet();
			for (String i : set) {
				System.out.println(map.get(i).getTen());
				System.out.println(map.get(i).getSodu());
			}
			System.out.println("Nhap 1 de tiep tuc");
			nhapso = scanner.nextInt();
			if (nhapso == 1) {
				String chiso = "";
				int kt1 = 0;
				int kt_quyen = 0;
				Set<String> set2 = map.keySet();
				scanner.nextLine();
				System.out.print("Moi ban dang nhap");
				String nhapten = scanner.nextLine();
				System.out.print("Moi ban nhap ma pin");
				int nhapmapin = scanner.nextInt();

				for (String i : set) {
					if (nhapten.equals(map.get(i).getTen()) && nhapmapin == map.get(i).getMapin()) {
						kt1 = 1;
						chiso = i;
						kt_quyen = map.get(i).getQuyen();
					}
				}
				if (kt1 == 0) {
					System.out.println("Ten dang nhap hoac ma pin k khop");
				} else if (kt1 == 1) {
					int tong = 0;
					System.out.println("Dang Nhap Thanh Cong");
					System.out.println(
							"Nhap 3 de nap tien nhap 7 de rut tien nhap 9 de chuyen tien NHAP 1 VAO TRANG ADMIN");
					int chon = scanner.nextInt();
					if (chon == 1) {
						if (kt_quyen == 1) {
							System.out.print("Nhap ADD de them tai khoan");
							System.out.print("Nhap EDIT de sua tai khoan");
							System.out.print("Nhap DELETE de xoa tai khoan");
							scanner.nextLine();
							String adminselection = scanner.nextLine();
							if (adminselection.equals("ADD")) {
								scanner.nextLine();
								System.out.print("Nhap ho ten dang ky");
								String ten = scanner.nextLine();
								System.out.print("Set ma pin");
								int mapin = scanner.nextInt();
								System.out.print("Confirm ma pin");
								int confirmmapin = scanner.nextInt();
								if (mapin != confirmmapin) {
									kt = 0;
								}
								if (kt1 == 0) {
									System.out.println("Ten dang nhap hoac ma pin k khop");
								} else {
									System.out.print("Nhap 1 neu la admin, nhap 2 neu la khach hang");
									int quyen = scanner.nextInt();
									System.out.println(
											"Nap tien de kich hoat tai khoan, so tien nap it nhat 50 la phi duy tri tai khoan");
									int sodu = scanner.nextInt();
									map.put(ten, new taikhoan(ten, mapin, sodu, quyen));

									Set<String> setnew = map.keySet();
									for (String i : setnew) {
										if (map.get(i).getQuyen() == 2) {
											System.out.println(map.get(i).getTen());
											System.out.println(map.get(i).getSodu());
										}
									}
								}
							} else if (adminselection.equals("EDIT")) {
								int kt_edit = 0;
								scanner.nextLine();
								int sodu1 = 0;
								int sodu2 = 0;
								String chiso1 = " ";
								String chiso2 = " ";
								System.out.print("Nhap ten tai khoan muon sua");
								String suatk = scanner.nextLine();
								for (String i : set) {
									if (map.get(i).getTen().equals(suatk)) {
										kt_edit = 1;
										chiso1 = i;
										scanner.nextLine();
										System.out.print("Sua ma pin");
										int sua_mapin = scanner.nextInt();
										System.out.print("Sua so du");
										int sua_sodu = scanner.nextInt();
										System.out.print("Sua so quyen 1 la admin 2 la user");
										int sua_quyen = scanner.nextInt();
										scanner.nextLine();
										System.out.print("Tai Khoan Ben Thu 2");
										String tk2 = scanner.nextLine();
										// map.put(suaten, new taikhoan(suaten, sua_mapin, sua_sodu, sua_quyen));

										Set<String> set3 = map.keySet();
										for (String i3 : set3) {
//											if (!(map.get(i3).getTen()).equals(tk2)) {
//												System.out.print("Tai khoan khong tim thay");
//												break;}
											 if (map.get(i3).getTen().equals(tk2)) {
												kt_edit = 3;
												sodu1 = map.get(i).getSodu() + sua_sodu;
												sodu2 = map.get(i3).getSodu() - (sua_sodu);
												map.put(suatk, new taikhoan(suatk, sua_mapin, sodu1, sua_quyen));
										//		map.put(tk2, new taikhoan(tk2, sua_mapin, sodu2, sua_quyen));
												map.get(i3).setSodu(sodu2);
											}
										}

									}

								}
								for (String afterchange : set) {
									System.out.println(map.get(afterchange).getTen());
									System.out.println(map.get(afterchange).getMapin());
									System.out.println(map.get(afterchange).getSodu());
								}

							} else if (adminselection.equals("DELETE")) {

							}

						} else if (chon == 3) {
							System.out.println("Nhap so tien muon nap");
							int nap = scanner.nextInt();
							tong = map.get(chiso).getSodu() + nap;
							System.out.println("So tien hien co trong tai khoan la: " + tong);
						} else if (chon == 7) {
							int conlai = 0;
							System.out.println(
									"Nhap so tien muon rut, so tien con lai k duoc duoi 50 de duy tri tai khoan");
							int rut = scanner.nextInt();
							conlai = map.get(chiso).getSodu() - rut;
							if (conlai < 0) {
								System.out.println("So tien trong tai khoan khong du");
							} else if (conlai < 50 && conlai > 0) {
								System.out.println("Phi duy tri tai khoan la 50, rut tien khong thanh cong");
							} else {
								System.out.println("So tien con lai trong tai khoan la: " + conlai);
							}
						} else if (chon == 9) {
							scanner.nextLine();
							int sodunhan = 0;
							int sodu = 0;
							int check = 0;
							String nhan = " ";
							System.out.print("Nhap ten nguoi nhan tien");
							String nguoinhan = scanner.nextLine();
							for (String a : set) {
								if (map.get(a).getTen().equals(nguoinhan)) {
									check = 1;
									nhan = a;
								}
							}
							if (check == 0) {
								System.out.print("tai khoan ngan hang khong hop le");
							} else if (map.get(nhan).getTen().equals(nguoinhan)) {
								System.out.print("Khong the chuyen tien cho chinh minh");
							} else if (check == 1) {
								System.out.print("Nhap so tien can chuyen, so du k duoi 50 de duy tri tai khoan");
							}
							int chuyentien = scanner.nextInt();
							sodu = map.get(chiso).getSodu() - chuyentien;
							if (sodu < 50) {
								System.out.print("Phi duy tri tai khoan la 50 so du khong du");
							} else if (sodu > 50) {
								sodunhan = map.get(nhan).getSodu() + chuyentien;
								System.out.println("Nguoi chuyen: " + map.get(chiso).getTen() + " sodu " + sodu);
								System.out.println("Nguoi nhan: " + map.get(nhan).getTen() + " sodunhan " + sodunhan);
							}

						}

					}

				}

			}

		}

	}
}
