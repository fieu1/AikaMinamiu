
import java.util.Scanner;

/**
 *
 * @author Aika
 */
public class minipro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        String name, wait, hukuman;
        int nim, choice1, choice2, choice21, choice221, choice222, choice3, tugas;
        int poin = 0;
        int choice22, choice23, choice24, choice25, choice26, choice27, choice28, choice29, choice291, choice292, choice293, choice31;
        int choice4, choice41, choice42, choice5, choice6, schoice;

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                          WELCOME TO POLINEMA ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Selamat atas disahkannya anda sebagai mahasiswa di institusi Politeknik Negeri Malang!");
        System.out.print("Masukkan nama anda : ");
        name = scs.nextLine();
        System.out.print("Masukkan NIM anda :  ");
        nim = sc.nextInt();

        System.out.println("Hari ini adalah hari pertama anda kuliah. Pilih aktivitas yang akan anda lakukan!");
        System.out.println("1. Melanjutkan tidur dan berangkat siang");
        System.out.println("2. Berangkat lebih awal");
        System.out.print("Pilihan anda : ");
        choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                System.out.println("Anda dimarahi dosen, jangan diulangi ya!");
                poin -= 5;
                break;
            case 2:
                System.out.println("Kerja bagus! Tingkatkan!");
                poin += 5;
                break;
            default:
                break;
        }
        wait = scs.nextLine();
        System.out.println("Perkuliahan berlangsung dengan lancar");
        wait = scs.nextLine();
        System.out.println("Phew, dosen telah selesai menjelaskan materi. Saat anda hendak membereskan barang barang, beliau berkata...");
        System.out.println("'Ini tugas untuk besok, jangan lupa dikerjakan ya!' .");
        wait = scs.nextLine();
        System.out.println("Anda sekarang memiliki 3 tugas");
        tugas = 3;
        wait = scs.nextLine();

        System.out.println("Yay perkuliahan hari ini telah usai! Apa yang akan anda lakukan?");
        System.out.println("1. Mengerjakan tugas di kampus");
        System.out.println("2. Pulang ke rumah");
        System.out.print("Pilihan anda : ");
        choice2 = sc.nextInt();

        if (choice2 == 1) {
            System.out.println("Sedang mengerjakan......");
            wait = scs.nextLine();
            tugas -= 1;
            System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
            System.out.println("1. Pulang ke rumah");
            System.out.println("2. Melanjutkan mengerjakan tugas");
            System.out.println("Pilihan anda : ");
            choice21 = sc.nextInt();
            if (choice21 == 1) {
                System.out.println("Anda segera merapikan barang barang anda dan segera pulang ke rumah....");
                wait = scs.nextLine();
                System.out.println("Huft, lelahnya~ . Anda duduk di beanbag dan membuka hp anda. Apa yang anda lakukan berikutnya?");
                System.out.println("1. Melanjutkan main hp");
                System.out.println("2. Mengerjakan tugas");
                System.out.print("Pilihan anda : ");
                choice22 = sc.nextInt();
                if (choice22 == 1) {
                    System.out.println("Scroll scroll scroll......");
                    wait = scs.nextLine();
                    System.out.println("Mata anda mulai lelah. Apa yang akan anda lakukan?");
                    System.out.println("1. Mengerjakan tugas");
                    System.out.println("2. Tidur");
                    System.out.print(" Pilihan anda : ");
                    choice23 = sc.nextInt();
                    if (choice23 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                        System.out.println("1. Melanjutkan tugas");
                        System.out.println("2. Tidur");
                        System.out.println("Pilihan anda : ");
                        choice24 = sc.nextInt();

                        if (choice24 == 1) {
                            System.out.println("Sedang mengerjakan......");
                            wait = scs.nextLine();
                            tugas -= 1;
                            System.out.println("Tugas anda : " + tugas + " Hwaaaa akhirnya selesai semua.");
                            System.out.println("Malam sudah mulai larut. Sebaiknya anda bersiap untuk besok dan beranjak tidur.");
                        } else if (choice24 == 2) {
                            System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                            wait = scs.nextLine();
                        }
                    } else if (choice23 == 2) {
                        System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                        wait = scs.nextLine();
                    }
                } else if (choice22 == 2) {
                    System.out.println("Sedang mengerjakan......");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                    System.out.println("1. Melanjutkan tugas");
                    System.out.println("2. Tidur");
                    System.out.println("Pilihan anda : ");
                    choice25 = sc.nextInt();
                    if (choice25 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Tugas anda yang tersisa : " + tugas);
                        System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\n Malam sudah mulai larut, sebaiknya anda tidur.");
                        wait = scs.nextLine();

                    } else if (choice25 == 2) {
                        System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                        wait = scs.nextLine();
                    }
                }
            } else if (choice21 == 2) {
                System.out.println("Anda melanjutkan tugas anda.");
                System.out.println("Sedang mengerjakan...");
                wait = scs.nextLine();
                tugas -= 1;
                System.out.println("Fuwaahh~ Satu tugas telah terselesaikan.");
                System.out.println("Sisa tugas anda sekarang " + tugas + ". Apa yang akan anda lakukan?");
                System.out.println("1. Melanjutkan tugas berikutnya ");
                System.out.println("2. Pulang");
                System.out.print("Pilihan anda : ");
                choice26 = sc.nextInt();

                if (choice26 == 1) {
                    System.out.println("Sedang mengerjakan......");

                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Tugas anda yang tersisa : " + tugas);
                    System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\n Sudah mulai larut, sebaiknya anda pulang dan istirahat.");
                    wait = scs.nextLine();
                    System.out.println("Anda pun pulang dan beristirahat.");
                    wait = scs.nextLine();
                } else if (choice26 == 2) {
                    System.out.println("Anda segera merapikan barang barang anda dan segera pulang ke rumah....");
                    wait = scs.nextLine();
                    System.out.println("Huft, lelahnya~ . Anda duduk di beanbag dan membuka hp anda. Apa yang anda lakukan berikutnya?");
                    System.out.println("1. Melanjutkan main hp");
                    System.out.println("2. Mengerjakan tugas");
                    System.out.print("Pilihan anda : ");
                    choice29 = sc.nextInt();
                    if (choice29 == 1) {
                        System.out.println("Scroll scroll scroll......");
                        wait = scs.nextLine();
                        System.out.println("Mata anda mulai lelah. Apa yang akan anda lakukan?");
                        System.out.println("1. Mengerjakan tugas");
                        System.out.println("2. Tidur");
                        System.out.print(" Pilihan anda : ");
                        choice291 = sc.nextInt();
                        if (choice291 == 1) {
                            System.out.println("Sedang mengerjakan......");
                            wait = scs.nextLine();
                            tugas -= 1;
                            System.out.println("Tugas anda : " + tugas + " Hwaaaa akhirnya selesai semua.");
                            System.out.println("Malam sudah mulai larut. Sebaiknya anda bersiap untuk besok dan beranjak tidur.");
                        } else if (choice291 == 2) {
                            System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                            wait = scs.nextLine();
                        }
                    } else if (choice29 == 2) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Tugas anda : " + tugas + " Hwaaaa akhirnya selesai semua.");
                        System.out.println("Malam sudah mulai larut. Sebaiknya anda bersiap untuk besok dan beranjak tidur.");

                    }

                }
            }
        } else if (choice2 == 2) {
            System.out.println("Anda segera merapikan barang barang anda dan segera pulang ke rumah....");
            wait = scs.nextLine();
            System.out.println("Huft, lelahnya~ . Anda duduk di beanbag dan membuka hp anda. Apa yang anda lakukan berikutnya?");
            System.out.println("1. Melanjutkan main hp");
            System.out.println("2. Mengerjakan tugas");
            System.out.print("Pilihan anda : ");
            choice29 = sc.nextInt();
            if (choice29 == 1) {
                System.out.println("Scroll scroll scroll......");
                wait = scs.nextLine();
                System.out.println("Mata anda mulai lelah. Apa yang akan anda lakukan?");
                System.out.println("1. Mengerjakan tugas");
                System.out.println("2. Tidur");
                System.out.print(" Pilihan anda : ");
                choice221 = sc.nextInt();
                if (choice221 == 1) {
                    System.out.println("Anda beranjak dan mulai mengerjakan tugas anda.");
                    System.out.println("Sedang mengerjakan...");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Fuwaahh~ Satu tugas telah terselesaikan.");
                    System.out.println("Sisa tugas anda sekarang " + tugas + ". Apa yang akan anda lakukan?");
                    System.out.println("1. Melanjutkan tugas berikutnya ");
                    System.out.println("2. Tidur");
                    System.out.print("Pilihan anda : ");
                    choice26 = sc.nextInt();

                    if (choice26 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                        System.out.println("1. Melanjutkan tugas");
                        System.out.println("2. Tidur");
                        System.out.println("Pilihan anda : ");
                        choice222 = sc.nextInt();
                        if (choice222 == 1) {
                            System.out.println("Sedang mengerjakan......");
                            wait = scs.nextLine();
                            tugas -= 1;
                            System.out.println("Tugas anda yang tersisa : " + tugas);
                            System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\nSudah mulai larut, sebaiknya anda istirahat.");
                            wait = scs.nextLine();
                            System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                            wait = scs.nextLine();
                        }
                    } else if (choice26 == 2) {
                        System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                        wait = scs.nextLine();
                    }
                } else if (choice221 == 2) {
                    System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                    wait = scs.nextLine();
                }
            } else if (choice29 == 2) {
                System.out.println("Anda mulai mengerjakan tugas anda.");
                System.out.println("Sedang mengerjakan...");
                wait = scs.nextLine();
                tugas -= 1;
                System.out.println("Fuwaahh~ Satu tugas telah terselesaikan.");
                System.out.println("Sisa tugas anda sekarang " + tugas + ". Apa yang akan anda lakukan?");
                System.out.println("1. Melanjutkan tugas berikutnya ");
                System.out.println("2. Tidur");
                System.out.print("Pilihan anda : ");
                choice26 = sc.nextInt();

                if (choice26 == 1) {
                    System.out.println("Sedang mengerjakan......");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                    System.out.println("1. Melanjutkan tugas");
                    System.out.println("2. Tidur");
                    System.out.println("Pilihan anda : ");
                    choice222 = sc.nextInt();
                    if (choice222 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Tugas anda yang tersisa : " + tugas);
                        System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\nSudah mulai larut, sebaiknya anda istirahat.");
                        wait = scs.nextLine();
                        System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                        wait = scs.nextLine();
                    }
                } else if (choice26 == 2) {
                    System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                    wait = scs.nextLine();
                }
            }
        }
        System.out.println("Beep beep beep");
        System.out.println("Suara alarm membangunkanmu. Hari kedua! Hari ini harus lebih baik dari kemarin");
        System.out.println("Apa yang akan anda lakukan?");
        System.out.println("1. Melanjutkan tidur dan berangkat siang");
        System.out.println("2. Berangkat lebih awal");
        System.out.print("Pilihan anda: ");
        choice3 = sc.nextInt();
        if (choice3 == 1) {
            System.out.println("Anda dimarahi dosen lagi, beliau bertanya apa yang menjadi konsekuensi jika terlambat lagi. Apa yang akan anda lakukan?");
            System.out.println("1. Alpha 3 jam");
            System.out.println("2. Dapat nilai C");
            System.out.print("Pilihan anda : ");
            choice31 = sc.nextInt();
            if (choice31 == 1) {
                hukuman = "alpha 3 jam";
                System.out.println("Jadi hukuman anda adalah" + hukuman);
            } else if (choice31 == 2) {
                hukuman = "dapat nilai C";
                System.out.println("Jadi hukuman anda adalah" + hukuman);
            }
            poin -= 5;
            wait = scs.nextLine();
        } else if (choice3 == 2) {
            System.out.println("Kerja bagus! Tingkatkan!");
            poin += 5;
            wait = scs.nextLine();
        }
        System.out.println("Dosen sedang menjelaskan materi....");
        wait = scs.nextLine();
        System.out.println("Hoaahhm.. bosan rasanya. Apa yang akan anda lakukan?");
        System.out.println("1. Tetap mendengarkan");
        System.out.println("2. Mengobrol dengan teman");
        System.out.print("Pilihan anda : ");
        choice4 = sc.nextInt();

        if (choice4 == 1) {
            System.out.println("Tiba-tiba dosen tersebut menunjuk anda dan bertanya");
            System.out.println("\"What's an interger?\"");
            System.out.println("1. A whole number that can be positive, negative, or zero.");
            System.out.println("2. A data type used in programming, is used to represent text rather than numbers. ");
            System.out.println("Pilihan anda : ");
            choice41 = sc.nextInt();

            if (choice41 == 1) {
                System.out.println("Bagus sekali!");
                poin += 5;
                wait = scs.nextLine();
            } else if (choice41 == 2) {
                System.out.println("Sayang sekali, jawaban anda salah.");
                poin -= 2;
                wait = scs.nextLine();
            }
        } else if (choice4 == 2) {
            System.out.println("Tiba-tiba dosen tersebut memanggil nama anda dan bertanya");
            System.out.println("\"What's an interger?\"");
            System.out.println("1. A whole number that can be positive, negative, or zero.");
            System.out.println("2. A data type used in programming, is used to represent text rather than numbers. ");
            System.out.println("Pilihan anda : ");
            choice42 = sc.nextInt();

            if (choice42 == 1) {
                System.out.println("Bagus! Tapi jangan mengobrol di dalam kelas ya..");
                poin -= 2;
                wait = scs.nextLine();
            } else if (choice42 == 2) {
                System.out.println("Dosen anda kecewa dengan anda. Tolong jangan diulangi lagi.");
                poin -= 5;
                wait = scs.nextLine();
            }
        }

        System.out.println("Kegiatan belajar mengajar kembali berjalan dengan normal.");
        wait = scs.nextLine();
        System.out.println("Sudah jam 6, saatnya pulang.");
        wait = scs.nextLine();
        System.out.println("Anda telah sampai di rumah. Lelahnyaaa~~");
        System.out.println("Anda sekarang memiliki " + tugas + " tugas");
        wait = scs.nextLine();

        switch (tugas) {
            case 3:
                System.out.println("Mau dikerjakan sekarang? (1 = Yes, 0 = No");
                System.out.println("Pilihan anda : ");
                schoice = sc.nextInt();
                if (schoice == 0) {
                    System.out.println("Anda hari ini hanya bersantai, bersiap untuk besok dan beristirahat.");
                    wait = scs.nextLine();
                } else if (schoice == 1) {
                    System.out.println("Anda mulai mengerjakan tugas anda.");
                    System.out.println("Sedang mengerjakan...");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Fuwaahh~ Satu tugas telah terselesaikan.");
                    System.out.println("Sisa tugas anda sekarang " + tugas + ". Apa yang akan anda lakukan?");
                    System.out.println("1. Melanjutkan tugas berikutnya ");
                    System.out.println("2. Tidur");
                    System.out.print("Pilihan anda : ");
                    choice26 = sc.nextInt();

                    if (choice26 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                        System.out.println("1. Melanjutkan tugas");
                        System.out.println("2. Tidur");
                        System.out.println("Pilihan anda : ");
                        choice222 = sc.nextInt();
                        if (choice222 == 1) {
                            System.out.println("Sedang mengerjakan......");
                            wait = scs.nextLine();
                            tugas -= 1;
                            System.out.println("Tugas anda yang tersisa : " + tugas);
                            System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\nSudah mulai larut, sebaiknya anda istirahat.");
                            wait = scs.nextLine();
                            System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                            wait = scs.nextLine();
                        }
                    } else if (choice26 == 2) {
                        System.out.println("Anda segera bersiap untuk esok hari dan beranjak tidur.");
                        wait = scs.nextLine();
                    }
                }
                break;
            case 2:
                System.out.println("Mau dikerjakan sekarang? (1 = Yes, 0 = No");
                System.out.println("Pilihan anda : ");
                schoice = sc.nextInt();
                if (schoice == 0) {
                    System.out.println("Anda hari ini hanya bersantai, bersiap untuk besok dan beristirahat.");
                    wait = scs.nextLine();
                } else if (schoice == 1) {
                    System.out.println("Sedang mengerjakan......");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Fyuh, selesai satu. Tugas anda tersisa " + tugas + ". Apa yang akan anda lakukan?");
                    System.out.println("1. Melanjutkan tugas");
                    System.out.println("2. Tidur");
                    System.out.println("Pilihan anda : ");
                    choice222 = sc.nextInt();
                    if (choice222 == 1) {
                        System.out.println("Sedang mengerjakan......");
                        wait = scs.nextLine();
                        tugas -= 1;
                        System.out.println("Tugas anda yang tersisa : " + tugas);
                        System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\nSudah mulai larut, sebaiknya anda istirahat.");
                        wait = scs.nextLine();
                        System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                        wait = scs.nextLine();
                    } else if (choice222 == 2) {
                        System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                        wait = scs.nextLine();
                    }
                }
                break;
            case 1:
                System.out.println("Mau dikerjakan sekarang? (1 = Yes, 0 = No");
                System.out.println("Pilihan anda : ");
                schoice = sc.nextInt();
                if (schoice == 0) {
                    System.out.println("Anda hari ini hanya bersantai, bersiap untuk besok dan beristirahat.");
                    wait = scs.nextLine();
                } else if (schoice == 1) {
                    System.out.println("Sedang mengerjakan......");
                    wait = scs.nextLine();
                    tugas -= 1;
                    System.out.println("Tugas anda yang tersisa : " + tugas);
                    System.out.println("Akhirnya tugas anda telah selesai! Lega sekali~" + "\nSudah mulai larut, sebaiknya anda istirahat.");
                    wait = scs.nextLine();
                    System.out.println("Anda pun bersiap untuk besok dan segera beristirahat.");
                    wait = scs.nextLine();
                }
                break;
            case 0:
                System.out.println("Anda bisa bersantai hari ini");
                wait = scs.nextLine();
                break;
        }
        System.out.println("Hari demi hari telah dijalani. Tak terasa sudah seminggu berlalu.");
        System.out.println("Apa yang akan anda lakukan?");
        System.out.println("1. Segera bersiap dan berangkat");
        System.out.println("2. Melanjutkan tidur dan berangkat siang");
        System.out.println("Pilihan anda : ");
        choice5 = sc.nextInt();

        if (choice5 == 1) {
            System.out.println("Kerja bagus! Tingkatkan ya~");
            wait = scs.nextLine();
        } else if (choice5 == 2) {
            System.out.println("Anda mendapat hukuman sesuai kesepakatan kemarin ");
            wait = scs.nextLine();
        }
        System.out.println("Perkuliahan berlangsung dengan lancar. Tapi tiba tiba....");
        wait = scs.nextLine();
        System.out.println(" \" Baiklah anak anak, sekarang kita akan membahas tugas kemarin \" ");
        wait = scs.nextLine();

        switch (tugas) {
            case 3:
                System.out.println("eh?");
                wait = scs.nextLine();
                System.out.println("EEEEEEHHHHHH?????");
                wait = scs.nextLine();
                System.out.println("Anda baru ingat bahwa anda belum mengerjakan tugas sama sekali.");
                System.out.println("\" Siapa yang belum mengerjakan tugas?\" ");
                System.out.println("Dengan gemetar, anda mengangkat tangan anda");
                wait = scs.nextLine();
                System.out.println("Dosen anda mengedarkan pandangan ke penjuru kelas dan berhenti ketika melihat tangan anda.");
                System.out.println("Dosen anda mendekati anda dan menatap meja anda yang hanya terdapat handphone.");
                wait = scs.nextLine();
                System.out.println("\" Belum sama sekali? \" ");
                wait = scs.nextLine();
                System.out.println("Anda mengangguk perlahan");
                wait = scs.nextLine();
                System.out.println("Dosen anda membalikkan badan seraya berkata...");
                wait = scs.nextLine();
                System.out.println("\"Anak anak, tutup bukunya dan kita ulangan hari ini");
                wait = scs.nextLine();
                System.out.println("=================QUIZ DADAKAN=================");

                poin -= 15;
                break;
            case 2:
                System.out.println("eh?");
                wait = scs.nextLine();
                System.out.println("EEEEEEHHHHHH?????");
                wait = scs.nextLine();
                System.out.println("Anda baru ingat bahwa anda belum mengerjakan tugas sama sekali.");
                System.out.println("\" Siapa yang belum mengerjakan tugas?\" ");
                System.out.println("Dengan gemetar, anda mengangkat tangan anda");
                wait = scs.nextLine();
                System.out.println("Dosen anda mengedarkan pandangan ke penjuru kelas dan berhenti ketika melihat tangan anda.");
                System.out.println("Dosen anda mendekati anda dan menatap meja anda yang hanya terdapat handphone.");
                wait = scs.nextLine();
                System.out.println("\" Kurang dua sama saja dengan tidak sama sekali \" ");
                wait = scs.nextLine();
                System.out.println("Anda menunduk...");
                wait = scs.nextLine();
                System.out.println("Dosen anda membalikkan badan seraya berkata...");
                wait = scs.nextLine();
                System.out.println("\"Anak anak, tutup bukunya dan kita ulangan hari ini");
                wait = scs.nextLine();
                System.out.println("=================QUIZ DADAKAN=================");
                poin -= 10;
                break;
            case 1:
                System.out.println("eh?");
                wait = scs.nextLine();
                System.out.println("EEEEEEHHHHHH?????");
                wait = scs.nextLine();
                System.out.println("Anda baru ingat bahwa anda belum mengerjakan tugas sama sekali.");
                System.out.println("\" Siapa yang belum mengerjakan tugas?\" ");
                System.out.println("Dengan gemetar, anda mengangkat tangan anda");
                wait = scs.nextLine();
                System.out.println("Dosen anda mengedarkan pandangan ke penjuru kelas dan berhenti ketika melihat tangan anda.");
                System.out.println("Dosen anda mendekati anda dan menatap meja anda yang hanya terdapat handphone.");
                wait = scs.nextLine();
                System.out.println("\" Kurang satu sama saja tidak sama sekali \" ");
                wait = scs.nextLine();
                System.out.println("Anda menunduk..");
                wait = scs.nextLine();
                System.out.println("Dosen anda membalikkan badan seraya berkata...");
                wait = scs.nextLine();
                System.out.println("\"Anak anak, tutup bukunya dan kita ulangan hari ini");
                wait = scs.nextLine();
                System.out.println("=================QUIZ DADAKAN=================");
                poin -= 5;
                break;
            case 0:
                System.out.println("Siapa yang belum mengerjakan?");
                wait = scs.nextLine();
                System.out.println("Dosen anda mengedarkan pandangan ke penjuru kelas");
                wait = scs.nextLine();
                System.out.println("\"Bagus, sekarang kita melanjutkan materi\"");
                wait = scs.nextLine();
                System.out.println("Perkuliahan kembali berjalan dengan lancar");
                wait = scs.nextLine();
                poin += 15;
                break;
            default:
                break;
        }

        System.out.println("Sepertinya cukup dulu permainan ini...");
        wait = scs.nextLine();
        System.out.println("Mohon maaf cerita ini belum selsai dikarenakan banyaknya kondisi yang ada di Polinema ini \ndan mohon maaf jika tidak sesuai dengan kondisi riil");
        System.out.println("poin total anda adalah : " + poin);
        if (poin >= 23) {
            System.out.println("Very good!");
        } else if (poin >= 17) {
            System.out.println("Great!");
        } else if (poin >= 5) {
            System.out.println("Good!");
        } else if (poin <= -20) {
            System.out.println("Worst");
        } else if (poin <= -10) {
            System.out.println("OK");
        }
        System.out.println("GAME OVER");
    }

}
