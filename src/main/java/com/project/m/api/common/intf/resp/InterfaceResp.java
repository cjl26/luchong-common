package com.project.m.api.common.intf.resp;

import java.util.HashMap;
import java.util.Map;

import com.project.m.api.common.intf.req.ProtocolType;

public class InterfaceResp {

	public static final String OPENID = "openid";
	public static final String API_VERSION = "api_version";
	public static final String CHARSET = "charset";
	public static final String TIMESTAMP = "timestamp";
	public static final String SERVICE = "service";
	public static final String BRAND = "brand";
	public static final String MODEL = "model";
	public static final String LANGUAGE = "language";
	public static final String VERSION = "version";
	public static final String SYSTEM = "system";
	public static final String PLATFORM = "platform";

	public static final String[] NON_BIZ_KEYS = { OPENID, API_VERSION, CHARSET, TIMESTAMP, SERVICE, BRAND, MODEL,
			LANGUAGE, VERSION, SYSTEM, PLATFORM };

	private String openid;

	private String api_version;

	private String charset;

	private String timestamp;

	private String service;

	private String brand;

	private String model;

	private String language;

	private String version;

	private String system;

	private String platform;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getApi_version() {
		return api_version;
	}

	public void setApi_version(String api_version) {
		this.api_version = api_version;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	private String responseBody;

	private ProtocolType protocolType;

	private Map<String, String> bizParam = new HashMap<String, String>();

	private Map<String, String> responseParam = new HashMap<String, String>();

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public ProtocolType getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(ProtocolType protocolType) {
		this.protocolType = protocolType;
	}

	public Map<String, String> getBizParam() {
		return bizParam;
	}

	public void setBizParam(Map<String, String> bizParam) {
		this.bizParam = bizParam;
	}

	public Map<String, String> getResponseParam() {
		return responseParam;
	}

	public void setResponseParam(Map<String, String> responseParam) {
		this.responseParam = responseParam;
	}

	private static String buildToString(InterfaceResp ir) {
		ProtocolType protocolType = ir.getProtocolType();
		String toString = "";
		switch (protocolType) {
		case HTTP_JSON:
			toString = ir.getResponseBody();
			break;
		default:
			toString = ir.getResponseParam().toString();
			break;
		}
		return toString;
	}

	@Override
	public String toString() {
		return InterfaceResp.buildToString(this);
	}

}
