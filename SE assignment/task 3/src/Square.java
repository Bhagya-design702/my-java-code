class Square implements Shape {
    @Override
    public void draw() {
        int size = 5; // Size of the square
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
