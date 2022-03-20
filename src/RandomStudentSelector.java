public class RandomStudentSelector {
    public static void main(String[] args) {

        String[] students = {
                "Abdullah Ibrahim",
                "Yakeen Jaber",
                "Katelyn De Graaf",
                "Vita Yuzko",
                "Sheker Hakberdiyeva",
                "LaToria Green",
                "Tasniem Hassan",
                "Taylor Green",
                "Ozden Firat",
                "Sumeyye Feyza Ozbek",
                "Abdullah Wazwaz",
                "Alona Fomina",
                "Daria Syvak",
                "Rami Turkmani",
                "Naim Abdullah",
                "Ismail Tawil",
                "Salah Musleh",
                "David Lopez Palmerin",
                "Kerem Nergiz",
                "Deniz Taskin",
                "Meldag Sav",
                "Uthman Musleh",
                "Reem Al-Sheikh",
                "Guluzar Incekara",
                "Ahmad Amin",
                "Chriskaly Ngo",
                "Andrei Mitioglo",
                "Regina Biktimirova",
                "Datkaiym Borbieva",
                "Abraham Kim",
                "Yousef M Saleh",
                "Mohammed Abedrabbo",
                "Nataliia Grynda",
                "Jonathan Ochoa"
        };

        System.out.println(students[(int) (Math.random() * 34)]);
    }
}
