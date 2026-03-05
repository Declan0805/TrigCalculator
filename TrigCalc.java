public class TrigCalc {
    private static final double DBZ = 1e-12;

    private static double ToRadians(double degrees){
        return Math.toRadians(degrees);
    }
    //Math Section
    public static double sine(double degrees){
        return Math.sin(ToRadians(degrees));
    }
    public static double cosine(double degrees){
        return Math.cos(ToRadians(degrees));
    }
    public static double tangent(double degrees){
        return Math.tan(ToRadians(degrees));
    }
    public static double cosecant(double degrees){
        double sinCheck = sine(degrees);
        if (Math.abs(sinCheck) < DBZ){
            return Double.NaN;
        }
        return 1.0/sinCheck;
    
    }
    public static double secant(double degrees){
        double cosCheck = cosine(degrees);
        if (Math.abs(cosCheck) < DBZ){
            return Double.NaN;
        }
        return 1.0/cosCheck;
        
    }
    public static double cotangent(double degrees){
        double tanCheck = tangent(degrees);
        if (Math.abs(tanCheck) < DBZ){
            return Double.NaN;
        }
        return 1.0/tanCheck;
        
    }
    public static double funcSolve(String trig, double degrees){
        switch (trig.toLowerCase()) {
            case "sin": return sine(degrees);
            case "cos": return cosine(degrees);
            case "tan": return tangent(degrees);
            case "sec": return secant(degrees);
            case "csc": return cosecant(degrees);
            case "cot": return cotangent(degrees);
            default: return Double.NaN;
        }
    }
}