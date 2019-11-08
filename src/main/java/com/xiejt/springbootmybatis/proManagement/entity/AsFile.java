package com.xiejt.springbootmybatis.proManagement.entity;

import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: xjt
 * @CreateDate: 2019/11/3$ 15:28$
 */
public class AsFile {
    private Integer id;
    private String asid;
    private String filename;
    private String filenameold;
    private String filetype;
    private String filepath;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsid() {
        return asid;
    }

    public void setAsid(String asid) {
        this.asid = asid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilenameold() {
        return filenameold;
    }

    public void setFilenameold(String filenameold) {
        this.filenameold = filenameold;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AsFile{" +
                "id=" + id +
                ", asid=" + asid +
                ", filename=" + filename +
                ", filenameold=" + filenameold +
                ", filetype=" + filetype +
                ", filepath=" + filepath +
                ", date=" + date +
                '}';
    }
}
