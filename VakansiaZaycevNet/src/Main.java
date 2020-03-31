public class Main {
    public static void main(String[] args) {
        User tester = new User(7,"Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
    static class  User {
        private long id = getId();
        private Vacancy vacancy;

        public User(long id, String developer) {
            this.id = id;
            developer = getVacancy();
        }

        String getVacancy() {
            return vacancy.getVacancy();
        }
        long getId() {
            return id;
        }
    }
    static class Vacancy {
        String getVacancy() {
            return vacancy;
        }
        private String vacancy;

        public Vacancy(String vacancy){
            this.vacancy = vacancy;
        }
    }
}
