package exercise1;

record Course(String discipline, int semester) {

    public String getCourse() {
        return """
                {
                "course ": "%s",
                "semester ": "%d"
                }
                """.formatted(discipline, semester);
    }
}
