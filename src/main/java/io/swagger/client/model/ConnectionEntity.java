/**
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.19.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BulletinEntity;
import io.swagger.client.model.ConnectionDTO;
import io.swagger.client.model.ConnectionStatusDTO;
import io.swagger.client.model.PermissionsDTO;
import io.swagger.client.model.PositionDTO;
import io.swagger.client.model.RevisionDTO;
import java.util.ArrayList;
import java.util.List;


/**
 * ConnectionEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class ConnectionEntity   {
  @SerializedName("revision")
  private RevisionDTO revision = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("bulletins")
  private List<BulletinEntity> bulletins = new ArrayList<BulletinEntity>();

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  @SerializedName("component")
  private ConnectionDTO component = null;

  @SerializedName("status")
  private ConnectionStatusDTO status = null;

  @SerializedName("bends")
  private List<PositionDTO> bends = new ArrayList<PositionDTO>();

  @SerializedName("labelIndex")
  private Integer labelIndex = null;

  @SerializedName("getzIndex")
  private Long getzIndex = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("sourceGroupId")
  private String sourceGroupId = null;

  /**
   * The type of component the source connectable is.
   */
  public enum SourceTypeEnum {
    @SerializedName("PROCESSOR")
    PROCESSOR("PROCESSOR"),
    
    @SerializedName("REMOTE_INPUT_PORT")
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    @SerializedName("REMOTE_OUTPUT_PORT")
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    @SerializedName("INPUT_PORT")
    INPUT_PORT("INPUT_PORT"),
    
    @SerializedName("OUTPUT_PORT")
    OUTPUT_PORT("OUTPUT_PORT"),
    
    @SerializedName("FUNNEL")
    FUNNEL("FUNNEL");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("sourceType")
  private SourceTypeEnum sourceType = null;

  @SerializedName("destinationId")
  private String destinationId = null;

  @SerializedName("destinationGroupId")
  private String destinationGroupId = null;

  /**
   * The type of component the destination connectable is.
   */
  public enum DestinationTypeEnum {
    @SerializedName("PROCESSOR")
    PROCESSOR("PROCESSOR"),
    
    @SerializedName("REMOTE_INPUT_PORT")
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    @SerializedName("REMOTE_OUTPUT_PORT")
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    @SerializedName("INPUT_PORT")
    INPUT_PORT("INPUT_PORT"),
    
    @SerializedName("OUTPUT_PORT")
    OUTPUT_PORT("OUTPUT_PORT"),
    
    @SerializedName("FUNNEL")
    FUNNEL("FUNNEL");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("destinationType")
  private DestinationTypeEnum destinationType = null;

  public ConnectionEntity revision(RevisionDTO revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
  public RevisionDTO getRevision() {
    return revision;
  }

  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }

  public ConnectionEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectionEntity uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "The URI for futures requests to the component.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ConnectionEntity position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ConnectionEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this component.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this component.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public ConnectionEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public ConnectionEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @ApiModelProperty(example = "null", value = "The bulletins for this component.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public ConnectionEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(example = "null", value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean getDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }

  public ConnectionEntity component(ConnectionDTO component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConnectionDTO getComponent() {
    return component;
  }

  public void setComponent(ConnectionDTO component) {
    this.component = component;
  }

  public ConnectionEntity status(ConnectionStatusDTO status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the connection.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the connection.")
  public ConnectionStatusDTO getStatus() {
    return status;
  }

  public void setStatus(ConnectionStatusDTO status) {
    this.status = status;
  }

  public ConnectionEntity bends(List<PositionDTO> bends) {
    this.bends = bends;
    return this;
  }

  public ConnectionEntity addBendsItem(PositionDTO bendsItem) {
    this.bends.add(bendsItem);
    return this;
  }

   /**
   * The bend points on the connection.
   * @return bends
  **/
  @ApiModelProperty(example = "null", value = "The bend points on the connection.")
  public List<PositionDTO> getBends() {
    return bends;
  }

  public void setBends(List<PositionDTO> bends) {
    this.bends = bends;
  }

  public ConnectionEntity labelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
    return this;
  }

   /**
   * The index of the bend point where to place the connection label.
   * @return labelIndex
  **/
  @ApiModelProperty(example = "null", value = "The index of the bend point where to place the connection label.")
  public Integer getLabelIndex() {
    return labelIndex;
  }

  public void setLabelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
  }

  public ConnectionEntity getzIndex(Long getzIndex) {
    this.getzIndex = getzIndex;
    return this;
  }

   /**
   * The z index of the connection.
   * @return getzIndex
  **/
  @ApiModelProperty(example = "null", value = "The z index of the connection.")
  public Long getGetzIndex() {
    return getzIndex;
  }

  public void setGetzIndex(Long getzIndex) {
    this.getzIndex = getzIndex;
  }

  public ConnectionEntity sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The identifier of the source of this connection.
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the source of this connection.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public ConnectionEntity sourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
    return this;
  }

   /**
   * The identifier of the group of the source of this connection.
   * @return sourceGroupId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the group of the source of this connection.")
  public String getSourceGroupId() {
    return sourceGroupId;
  }

  public void setSourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
  }

  public ConnectionEntity sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The type of component the source connectable is.
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of component the source connectable is.")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public ConnectionEntity destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The identifier of the destination of this connection.
   * @return destinationId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the destination of this connection.")
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public ConnectionEntity destinationGroupId(String destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
    return this;
  }

   /**
   * The identifier of the group of the destination of this connection.
   * @return destinationGroupId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the group of the destination of this connection.")
  public String getDestinationGroupId() {
    return destinationGroupId;
  }

  public void setDestinationGroupId(String destinationGroupId) {
    this.destinationGroupId = destinationGroupId;
  }

  public ConnectionEntity destinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * The type of component the destination connectable is.
   * @return destinationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of component the destination connectable is.")
  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionEntity connectionEntity = (ConnectionEntity) o;
    return Objects.equals(this.revision, connectionEntity.revision) &&
        Objects.equals(this.id, connectionEntity.id) &&
        Objects.equals(this.uri, connectionEntity.uri) &&
        Objects.equals(this.position, connectionEntity.position) &&
        Objects.equals(this.permissions, connectionEntity.permissions) &&
        Objects.equals(this.bulletins, connectionEntity.bulletins) &&
        Objects.equals(this.disconnectedNodeAcknowledged, connectionEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.component, connectionEntity.component) &&
        Objects.equals(this.status, connectionEntity.status) &&
        Objects.equals(this.bends, connectionEntity.bends) &&
        Objects.equals(this.labelIndex, connectionEntity.labelIndex) &&
        Objects.equals(this.getzIndex, connectionEntity.getzIndex) &&
        Objects.equals(this.sourceId, connectionEntity.sourceId) &&
        Objects.equals(this.sourceGroupId, connectionEntity.sourceGroupId) &&
        Objects.equals(this.sourceType, connectionEntity.sourceType) &&
        Objects.equals(this.destinationId, connectionEntity.destinationId) &&
        Objects.equals(this.destinationGroupId, connectionEntity.destinationGroupId) &&
        Objects.equals(this.destinationType, connectionEntity.destinationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component, status, bends, labelIndex, getzIndex, sourceId, sourceGroupId, sourceType, destinationId, destinationGroupId, destinationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionEntity {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bends: ").append(toIndentedString(bends)).append("\n");
    sb.append("    labelIndex: ").append(toIndentedString(labelIndex)).append("\n");
    sb.append("    getzIndex: ").append(toIndentedString(getzIndex)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceGroupId: ").append(toIndentedString(sourceGroupId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    destinationGroupId: ").append(toIndentedString(destinationGroupId)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
