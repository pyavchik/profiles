package in.freebitco.util;

public class TimeUtil  {

    /**
     * Method to return implicit wait
     * @return
     */
    public static long getImplicitWait(){

        return Long.parseLong(PropertyReader.getInstance()
                .getProperty(PropKey.IMPLICIT_WAIT.getPropVal()));
    }

    /**
     * Method to return implicit wait
     * @return
     */
    public static long getExplicitWait(){

        return Long.parseLong(PropertyReader.getInstance()
                .getProperty(PropKey.EXPLICIT_WAIT.getPropVal()));
    }

}
