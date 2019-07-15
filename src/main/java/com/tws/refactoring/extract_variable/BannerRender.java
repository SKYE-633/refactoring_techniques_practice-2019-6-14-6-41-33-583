package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isIEOnMac = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));
        if (isIEOnMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
