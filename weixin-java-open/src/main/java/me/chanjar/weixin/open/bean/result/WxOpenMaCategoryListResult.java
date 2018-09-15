package me.chanjar.weixin.open.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import me.chanjar.weixin.open.bean.ma.WxOpenMaCategory;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 微信开放平台小程序分类目录列表返回
 *
 * @author yqx
 * @date 2018/9/12
 */
@Data
public class WxOpenMaCategoryListResult implements Serializable {

  private String errcode;
  private String errmsg;

  @SerializedName("category_list")
  List<WxOpenMaCategory> categoryList;

  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

}
