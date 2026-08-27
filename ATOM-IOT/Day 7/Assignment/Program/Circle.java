class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format(
            "Circle [Color: %s, Radius: %.1f, Area: %.2f]",
            super.toString().replace("Shape color: ", ""),
            radius,
            getArea()
        );
    }
}