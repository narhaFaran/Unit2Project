public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
     public double calculateSlope() {
        return (y2-y1)/(x2-x1);
     }

     public double yIntercept() {
        return y1 - calculateSlope()*x1;
     }
     public String returnEquation() {
        if(calculateSlope() == 1) {
            if(yIntercept() > 0) {
                return "y = x + " + yIntercept();
            } else {
                return "y = x - " + Math.abs(yIntercept());
            }
        } else if (calculateSlope() == -1) {
            if(yIntercept() > 0) {
                return "y = -x + " + yIntercept();
            } else {
                return "y = - - " + Math.abs(yIntercept());
            }
        } else {

        }
     }
}
