import java.util.Scanner;

public class ShapeCalculation {
  private final Scanner scan = new Scanner(System.in);

  public String squareFormula() {

    System.out.print("Side length: ");
    int value = scan.nextInt();

    double perimeter = 4 * value;
    double area = value * value;

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String rectangleFormula() {
    System.out.print("Length: ");
    double valueL = Double.parseDouble(scan.nextLine());
    System.out.print("Width: ");
    double valueW = Double.parseDouble(scan.nextLine());

    double perimeter = 2 * (valueL + valueW);
    double area = valueL * valueW;

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String circleFormula() {
    System.out.print("Radius: ");
    double value = Double.parseDouble(scan.nextLine());

    double perimeter = 2 * Math.PI * value;
    double area = Math.PI * (value * value);

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String triangleFormula() {
    System.out.println("Side Length: a,b,c");
    String input = scan.nextLine();
    String[] parts = input.split(",");

    double a = Double.parseDouble(parts[0]);
    double b = Double.parseDouble(parts[1]);
    double c = Double.parseDouble(parts[2]);

    double perimeter = a + b + c;
    double s = perimeter / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String rhombusFormula() {
    System.out.println("Side Length: ");
    double value = Double.parseDouble(scan.nextLine());

    System.out.println("X/Y: x,y");
    String input = scan.nextLine();
    String[] part = input.split(",");

    double x = Double.parseDouble(part[0]);
    double y = Double.parseDouble(part[1]);

    double perimeter = 4 * value;
    double area = (0.5) * (x * y);

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String trapezoidFormula() {
    System.out.println("Side Length: a,b,c,d");
    String input = scan.nextLine();
    String[] part = input.split(",");

    double a = Double.parseDouble(part[0]);
    double b = Double.parseDouble(part[1]);
    double c = Double.parseDouble(part[2]);
    double d = Double.parseDouble(part[3]);

    System.out.println("Base/Height: b1,b2,h");
    String input2 = scan.nextLine();
    String[] part2 = input2.split(",");

    double base1 = Double.parseDouble(part2[0]);
    double base2 = Double.parseDouble(part2[1]);
    double height = Double.parseDouble(part2[2]);

    double perimeter = a + b + c + d;
    double area = (double) 1 / 2 * (base1 + base2) * height;

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String kiteFormula() {
    System.out.println("Sides: a,b");
    String input = scan.nextLine();
    String[] part = input.split(",");

    double a = Double.parseDouble(part[0]);
    double b = Double.parseDouble(part[1]);

    System.out.println("X/Y: x,y");

    String input2 = scan.nextLine();
    String[] part2 = input2.split(",");

    double x = Double.parseDouble(part2[0]);
    double y = Double.parseDouble(part2[1]);

    double perimeter = 2 * (a + b);
    double area = (0.5) * (x * y);
    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String polygonFormula() {
    System.out.println("n Sides, l Sides: n,l");
    String input = scan.nextLine();
    String[] part = input.split(",");

    double nSide = Double.parseDouble(part[0]);
    double lSide = Double.parseDouble(part[1]);

    double perimeter = nSide * lSide;

    double cot = Math.cos(Math.PI / nSide) / Math.sin(Math.PI / nSide);
    double area = (1.0 / 4) * nSide * Math.pow(lSide, 2) * cot;

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }

  public String ellipseFormula() {
    System.out.println("Major/Minor Axis: a,b");
    String input = scan.nextLine();
    String[] part = input.split(",");

    double a = Double.parseDouble(part[0]);
    double b = Double.parseDouble(part[1]);

    double area = Math.PI * a * b;

    double step1 = 3 * (a + b);
    double step2 = Math.sqrt(((3 * a + b) * (a + 3 * b)));
    double perimeter = (Math.PI) * step1 - step2;

    return "Area: " + area + "\n" + "Perimeter: " + perimeter;
  }
}
