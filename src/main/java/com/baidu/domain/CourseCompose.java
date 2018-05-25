package com.baidu.domain;

public class CourseCompose {
    private Long id;

    private String composeid;

    private String name;

    private String course1id;

    private String course2id;

    private String course3id;

    private Byte type;

    private Byte status;

    private String creator;

    private Long createdate;

    private String lastmodifier;

    private Long lastmoddate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComposeid() {
        return composeid;
    }

    public void setComposeid(String composeid) {
        this.composeid = composeid == null ? null : composeid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCourse1id() {
        return course1id;
    }

    public void setCourse1id(String course1id) {
        this.course1id = course1id == null ? null : course1id.trim();
    }

    public String getCourse2id() {
        return course2id;
    }

    public void setCourse2id(String course2id) {
        this.course2id = course2id == null ? null : course2id.trim();
    }

    public String getCourse3id() {
        return course3id;
    }

    public void setCourse3id(String course3id) {
        this.course3id = course3id == null ? null : course3id.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Long createdate) {
        this.createdate = createdate;
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier == null ? null : lastmodifier.trim();
    }

    public Long getLastmoddate() {
        return lastmoddate;
    }

    public void setLastmoddate(Long lastmoddate) {
        this.lastmoddate = lastmoddate;
    }
}