package net.nicovrc.dev.data;

public class NicoNicoCookie {

    private String nicosid;
    private String registrationActionTrackId;
    private String user_session;
    private String mfa_session;
    private String mfw_url;
    private boolean isLogin;

    public String getNicosid() {
        return nicosid;
    }

    public void setNicosid(String nicosid) {
        this.nicosid = nicosid;
    }

    public String getRegistrationActionTrackId() {
        return registrationActionTrackId;
    }

    public void setRegistrationActionTrackId(String registrationActionTrackId) {
        this.registrationActionTrackId = registrationActionTrackId;
    }

    public String getUser_session() {
        return user_session;
    }

    public void setUser_session(String user_session) {
        this.user_session = user_session;
    }

    public String getMfa_session() {
        return mfa_session;
    }

    public void setMfa_session(String mfa_session) {
        this.mfa_session = mfa_session;
    }

    public String getMfw_url() {
        return mfw_url;
    }

    public void setMfw_url(String mfw_url) {
        this.mfw_url = mfw_url;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
