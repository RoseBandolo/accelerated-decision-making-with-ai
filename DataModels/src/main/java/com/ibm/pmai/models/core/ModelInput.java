/*
 * Copyright 2022 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.pmai.models.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name="model_input")
@ApiModel("ModelInput")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ModelInput extends BaseModel {
    @Schema(hidden = true)
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private String id;

    @Column
    private String type;

    @Column
    private String notes;

    @Column
    private String key;

    @Column
    private String container_path;

    @Column(name="json_mapper", columnDefinition="TEXT")
    private String json_mapper;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContainer_path() {
        return container_path;
    }

    public void setContainer_path(String container_path) {
        this.container_path = container_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJson_mapper() {
        return json_mapper;
    }

    public void setJson_mapper(String json_mapper) {
        this.json_mapper = json_mapper;
    }
}
