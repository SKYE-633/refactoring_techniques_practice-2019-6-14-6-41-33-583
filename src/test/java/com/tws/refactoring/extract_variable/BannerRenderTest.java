package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_Is_mac_and_browser_Is_ie() {
        //given
        BannerRender bannerRender = new BannerRender();
        String platform = "MAC";
        String browser = "IE";
        //when
        String result = "IE on Mac?";
        String actualResult = bannerRender.renderBanner(platform, browser);
        //then
        Assert.assertSame(result, actualResult);
    }

    @Test
    public void should_return_IE_on_Mac_when_platform_Is_not_mac_and_browser_Is_ie() {
        //given
        BannerRender bannerRender = new BannerRender();
        String platform = "Windows";
        String browser = "IE";
        //when
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);
        //then
        Assert.assertSame(result, actualResult);
    }

    @Test
    public void should_return_IE_on_Mac_when_platform_Is_mac_but_browser_Is_not_ie() {
        //given
        BannerRender bannerRender = new BannerRender();
        String platform = "MAC";
        String browser = "Chrome";
        //when
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);
        //then
        Assert.assertSame(result, actualResult);
    }

    @Test
    public void should_return_IE_on_Mac_when_platform_Is_not_mac_and_browser_Is_not_ie() {
        //given
        BannerRender bannerRender = new BannerRender();
        String platform = "Windows";
        String browser = "Chrome";
        //when
        String result = "banner";
        String actualResult = bannerRender.renderBanner(platform, browser);
        //then
        Assert.assertSame(result, actualResult);
    }
}