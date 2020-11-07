package in.freebitco.util;

import in.freebitco.driver.BrowserType;

public class SystemPropertyHelper {


    /**
     * Method to get value for elementScreenShot
     *
     * @return
     */
    public static String getElementScreenShotValue() {

        String msg = "";

        String valueFromPropFile = PropertyReader.getInstance()
                .getProperty(PropKey.ELEMENT_SCREEN_SHOT.getPropVal());

        String valueFromSystemVariable = System.getProperty("elementScreenShot");

        if (valueFromSystemVariable.length() > 0) {

            if (valueFromSystemVariable.equalsIgnoreCase("ENABLE") ||
                    valueFromSystemVariable.equalsIgnoreCase("DISABLE")) {

                return valueFromSystemVariable;
            } else {

                msg = "Incorrect system property " + valueFromSystemVariable + " value specified for"
                        + PropKey.ELEMENT_SCREEN_SHOT.getPropVal() +
                        " ...defaulting to property provided by the application.properties file " +
                        PropKey.ELEMENT_SCREEN_SHOT.getPropVal() + " : " + valueFromPropFile;
                System.out.println(msg);
            }
        }

        msg = "No system property specified" +
                " ...defaulting to application.properties file ->  " +
                PropKey.ELEMENT_SCREEN_SHOT.getPropVal() + " : " + valueFromPropFile;

        System.out.println(msg);
        return valueFromPropFile;
    }


    /**
     * Get is Remote Value
     *
     * @return
     */
    public static String getRemoteVal() {

        String msg = "";
        String valueFromPropFile = PropertyReader.getInstance()
                .getProperty(PropKey.REMOTE.getPropVal());

        String remoteVal = System.getProperty(PropKey.REMOTE.getPropVal());

        if (remoteVal.length() > 0) {
            if (remoteVal.equalsIgnoreCase("TRUE") ||
                    remoteVal.equalsIgnoreCase("FALSE")) {

                return remoteVal;
            } else {

                msg = "Incorrect system property " + remoteVal + " value specified for"
                        + PropKey.REMOTE.getPropVal() +
                        " ...defaulting to property provided by the application.properties file " +
                        PropKey.REMOTE.getPropVal() + " : " + valueFromPropFile;

                System.out.println(msg);
            }
        }

        msg = "No system property specified" +
                " ...defaulting to application.properties file ->  " +
                PropKey.REMOTE.getPropVal() + " : " + valueFromPropFile;

        System.out.println(msg);

        return valueFromPropFile;
    }


    /**
     * Get Hub Url
     *
     * @return
     */
    public static String getHubUrl() {

        String hubUrl = System.getProperty(PropKey.HUB_URL.getPropVal());

        if (hubUrl.length() > 0) {
            return hubUrl;
        }

        return PropertyReader.getInstance().getProperty(PropKey.HUB_URL.getPropVal());
    }

    /**
     * Get browser value from pom.xml
     *
     * @return
     */
    public static BrowserType getBrowserFromSystemVariable() {

        String browser = System.getProperty(PropKey.BROWSER.getPropVal());

        if (browser.length() <= 0) {
            browser = PropertyReader.getInstance().getProperty(PropKey.BROWSER.getPropVal());
        }

        if (browser.equalsIgnoreCase("FIREFOX1")) {

            return BrowserType.FIREFOX1;
        } else if (browser.equalsIgnoreCase("FIREFOX2")) {

            return BrowserType.FIREFOX2;
        } else {
            return null;
        }
    }
}
