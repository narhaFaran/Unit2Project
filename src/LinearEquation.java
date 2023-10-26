public class LinearEquation {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Calculates and returns the distances between the two points
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }

    //calculates and returns the y-intercept of the equation
    public double yIntercept() {
        return roundedToHundredth((double)y1 - slope()*x1);
    }

    //calculates and returns the slope of the equation
    public double slope() {
        return ((double)y2-y1)/((double)x2-x1);

    }

    //returns the equation
    public String equation() {
        if(slope() == 1) {
            if(yIntercept() > 0) {
                return "y = x + " + yIntercept();
            } else if (yIntercept() < 0){
                return "y = x - " + Math.abs(yIntercept());
            } else {
                return "y = x";
            }

        } else if (slope() == -1) {
            if(yIntercept() > 0) {
                return "y = -x + " + yIntercept();
            } else if (yIntercept() < 0){
                return "y = -x - " + Math.abs(yIntercept());
            } else {
                return "y = -x";
            }

        } else if(slope() == 0) {
            if (slope() % 1 == 0) {
                return "y = " + (int)yIntercept();
            } else {
                return "y = " + yIntercept();
            }
        } else {
            if(slope() > 0 && slope() % 1 != 0) {
                if (yIntercept() > 0) {
                    return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x + " +yIntercept();
                } else if(yIntercept() == 0){
                    return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x";
                } else {
                    return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x - " + Math.abs(yIntercept());
                }

            } else if(slope() == 0){
                return "y = " + yIntercept();

            } else {
                if(slope() % 1 == 0.0) {
                    if(slope()>0) {
                        if(yIntercept() > 0) {
                            return "y = " + (y2-y1)/(x2-x1) + "x + " + yIntercept();
                        } else if (yIntercept() == 0) {
                            return "y = " + (y2-y1)/(x2-x1) + "x";
                        } else {
                            return "y = " + (y2-y1)/(x2-x1) + "x - " + Math.abs(yIntercept());
                        }
                    } else {
                        if(yIntercept() > 0) {
                            return "y = " + (y2-y1)/(x2-x1) + "x + " + yIntercept();
                        } else if (yIntercept() == 0) {
                            return "y = " + (y2-y1)/(x2-x1) + "x";
                        } else {
                            return "y = " + (y2-y1)/(x2-x1) + "x - " + Math.abs(yIntercept());
                        }
                    }

                }else {
                    if(yIntercept() > 0) {
                        return "y = -" + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x + " + yIntercept();
                    } else if (yIntercept() == 0) {
                        return "y = -" + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x";
                    } else {
                        return "y = -" + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x - " + Math.abs(yIntercept());
                    }
                }

            }
        }
    }

    public String coordinateForX(double xValue) {
        double y = roundedToHundredth(slope()*xValue + yIntercept());
        return "(" + xValue + ", " + y + ")";
    }
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.;
    }
    public String lineInfo() {
        String str = "Points: ";
        str += "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") \n";
        str += "Equation: " + equation() + "\n";
        str += "Slope: " + roundedToHundredth(slope()) + "\n";
        str += "y-Intercept: " + yIntercept() + "\n";
        str += "Distance between points: " + distance();
        return str;
    }
}
