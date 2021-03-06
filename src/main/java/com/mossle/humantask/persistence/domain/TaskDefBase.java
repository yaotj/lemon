package com.mossle.humantask.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaskDefBase .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TASK_DEF_BASE")
public class TaskDefBase implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String processDefinitionId;

    /** null. */
    private String formKey;

    /** null. */
    private String formType;

    /** null. */
    private String countersignType;

    /** null. */
    private String countersignUser;

    /** null. */
    private String countersignStrategy;

    /** null. */
    private Integer countersignRate;

    /** null. */
    private String assignStrategy;

    /** . */
    private Set<TaskDefDeadline> taskDefDeadlines = new HashSet<TaskDefDeadline>(
            0);

    /** . */
    private Set<TaskDefNotification> taskDefNotifications = new HashSet<TaskDefNotification>(
            0);

    /** . */
    private Set<TaskDefUser> taskDefUsers = new HashSet<TaskDefUser>(0);

    /** . */
    private Set<TaskDefOperation> taskDefOperations = new HashSet<TaskDefOperation>(
            0);

    public TaskDefBase() {
    }

    public TaskDefBase(String code, String name, String processDefinitionId,
            String formKey, String formType, String countersignType,
            String countersignUser, String countersignStrategy,
            Integer countersignRate, String assignStrategy,
            Set<TaskDefDeadline> taskDefDeadlines,
            Set<TaskDefNotification> taskDefNotifications,
            Set<TaskDefUser> taskDefUsers,
            Set<TaskDefOperation> taskDefOperations) {
        this.code = code;
        this.name = name;
        this.processDefinitionId = processDefinitionId;
        this.formKey = formKey;
        this.formType = formType;
        this.countersignType = countersignType;
        this.countersignUser = countersignUser;
        this.countersignStrategy = countersignStrategy;
        this.countersignRate = countersignRate;
        this.assignStrategy = assignStrategy;
        this.taskDefDeadlines = taskDefDeadlines;
        this.taskDefNotifications = taskDefNotifications;
        this.taskDefUsers = taskDefUsers;
        this.taskDefOperations = taskDefOperations;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "PROCESS_DEFINITION_ID", length = 200)
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    /**
     * @param processDefinitionId
     *            null.
     */
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    /** @return null. */
    @Column(name = "FORM_KEY", length = 200)
    public String getFormKey() {
        return this.formKey;
    }

    /**
     * @param formKey
     *            null.
     */
    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    /** @return null. */
    @Column(name = "FORM_TYPE", length = 50)
    public String getFormType() {
        return this.formType;
    }

    /**
     * @param formType
     *            null.
     */
    public void setFormType(String formType) {
        this.formType = formType;
    }

    /** @return null. */
    @Column(name = "COUNTERSIGN_TYPE", length = 50)
    public String getCountersignType() {
        return this.countersignType;
    }

    /**
     * @param countersignType
     *            null.
     */
    public void setCountersignType(String countersignType) {
        this.countersignType = countersignType;
    }

    /** @return null. */
    @Column(name = "COUNTERSIGN_USER", length = 200)
    public String getCountersignUser() {
        return this.countersignUser;
    }

    /**
     * @param countersignUser
     *            null.
     */
    public void setCountersignUser(String countersignUser) {
        this.countersignUser = countersignUser;
    }

    /** @return null. */
    @Column(name = "COUNTERSIGN_STRATEGY", length = 50)
    public String getCountersignStrategy() {
        return this.countersignStrategy;
    }

    /**
     * @param countersignStrategy
     *            null.
     */
    public void setCountersignStrategy(String countersignStrategy) {
        this.countersignStrategy = countersignStrategy;
    }

    /** @return null. */
    @Column(name = "COUNTERSIGN_RATE")
    public Integer getCountersignRate() {
        return this.countersignRate;
    }

    /**
     * @param countersignRate
     *            null.
     */
    public void setCountersignRate(Integer countersignRate) {
        this.countersignRate = countersignRate;
    }

    /** @return null. */
    @Column(name = "ASSIGN_STRATEGY", length = 100)
    public String getAssignStrategy() {
        return this.assignStrategy;
    }

    /**
     * @param assignStrategy
     *            null.
     */
    public void setAssignStrategy(String assignStrategy) {
        this.assignStrategy = assignStrategy;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
    public Set<TaskDefDeadline> getTaskDefDeadlines() {
        return this.taskDefDeadlines;
    }

    /**
     * @param taskDefDeadlines
     *            .
     */
    public void setTaskDefDeadlines(Set<TaskDefDeadline> taskDefDeadlines) {
        this.taskDefDeadlines = taskDefDeadlines;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
    public Set<TaskDefNotification> getTaskDefNotifications() {
        return this.taskDefNotifications;
    }

    /**
     * @param taskDefNotifications
     *            .
     */
    public void setTaskDefNotifications(
            Set<TaskDefNotification> taskDefNotifications) {
        this.taskDefNotifications = taskDefNotifications;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
    public Set<TaskDefUser> getTaskDefUsers() {
        return this.taskDefUsers;
    }

    /**
     * @param taskDefUsers
     *            .
     */
    public void setTaskDefUsers(Set<TaskDefUser> taskDefUsers) {
        this.taskDefUsers = taskDefUsers;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
    public Set<TaskDefOperation> getTaskDefOperations() {
        return this.taskDefOperations;
    }

    /**
     * @param taskDefOperations
     *            .
     */
    public void setTaskDefOperations(Set<TaskDefOperation> taskDefOperations) {
        this.taskDefOperations = taskDefOperations;
    }
}
