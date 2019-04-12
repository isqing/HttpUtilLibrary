package com.qing.net.httputillibrary;

/**
 * create by yqli on 2019/4/11
 */
public class MyResponse {

    /**
     * response : 200
     * version : {"versioncode":"","fileURL":"http://iflyad.bjdn.openstorage.cn/dooh/VoiceAds_Smart_Screen_uid_2_3.0.apk","MD5":"DDD ","desc":"d"}
     */

    private String response;
    /**
     * versioncode :
     * fileURL : http://iflyad.bjdn.openstorage.cn/dooh/VoiceAds_Smart_Screen_uid_2_3.0.apk
     * MD5 : DDD
     * desc : d
     */

    private VersionBean version;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public VersionBean getVersion() {
        return version;
    }

    public void setVersion(VersionBean version) {
        this.version = version;
    }

    public static class VersionBean {
        private String versioncode;
        private String fileURL;
        private String MD5;
        private String desc;

        public String getVersioncode() {
            return versioncode;
        }

        public void setVersioncode(String versioncode) {
            this.versioncode = versioncode;
        }

        public String getFileURL() {
            return fileURL;
        }

        public void setFileURL(String fileURL) {
            this.fileURL = fileURL;
        }

        public String getMD5() {
            return MD5;
        }

        public void setMD5(String MD5) {
            this.MD5 = MD5;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
