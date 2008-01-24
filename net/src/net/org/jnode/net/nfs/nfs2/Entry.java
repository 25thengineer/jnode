package org.jnode.net.nfs.nfs2;

public class Entry {
    private int fileId;

    private String name;

    private byte[] cookie;

    public Entry(int fileId, String name, byte[] cookie) {
        this.fileId = fileId;
        this.name = name;
        this.cookie = cookie;
    }

    public int getFileId() {
        return fileId;
    }

    public String getName() {
        return name;
    }

    public byte[] getCookie() {
        return cookie;
    }

}