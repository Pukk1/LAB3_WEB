package com.mobest1an.labs.MBeans;

public interface UserStatisticProviderMBean {

    int getUserPointsCount();
    void setUserPointsCount(int pointsCount);

    boolean isUserDoubleMissed();
    void setUserDoubleMissed(boolean userDoubleMissed);
}
