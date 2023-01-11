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
import io.swagger.client.model.TemplateEntity;
import java.util.ArrayList;
import java.util.List;


/**
 * TemplatesEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:57:19.352+09:00")
public class TemplatesEntity   {
  @SerializedName("templates")
  private List<TemplateEntity> templates = new ArrayList<TemplateEntity>();

  @SerializedName("generated")
  private String generated = null;

  public TemplatesEntity templates(List<TemplateEntity> templates) {
    this.templates = templates;
    return this;
  }

  public TemplatesEntity addTemplatesItem(TemplateEntity templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TemplateEntity> getTemplates() {
    return templates;
  }

  public void setTemplates(List<TemplateEntity> templates) {
    this.templates = templates;
  }

  public TemplatesEntity generated(String generated) {
    this.generated = generated;
    return this;
  }

   /**
   * When this content was generated.
   * @return generated
  **/
  @ApiModelProperty(example = "null", value = "When this content was generated.")
  public String getGenerated() {
    return generated;
  }

  public void setGenerated(String generated) {
    this.generated = generated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatesEntity templatesEntity = (TemplatesEntity) o;
    return Objects.equals(this.templates, templatesEntity.templates) &&
        Objects.equals(this.generated, templatesEntity.generated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, generated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatesEntity {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
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

