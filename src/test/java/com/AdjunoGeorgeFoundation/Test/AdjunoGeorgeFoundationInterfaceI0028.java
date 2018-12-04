package com.AdjunoGeorgeFoundation.Test;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import org.testng.annotations.Test;

public class AdjunoGeorgeFoundationInterfaceI0028 {
		
	String json ="{\r\n\"PurchaseOrder\": {\r\n\"MessageHeader\": {\r\n\"CreationDateTime\": \"2018-04-20T14:45:00Z\",\r\n\"MessageID\": 1,\r\n\"Sender\": {\r\n\"ComponentID\": \"SAPFMS\",\r\n\"ConfirmationCode\": \"OnError\",\r\n\"ReferenceID\": \"1234\",\r\n\"SenderID\": \"a\",\r\n\"TaskID\": \"a\"\r\n}\r\n},\r\n\"PurchaseOrderNo\": 54342,\r\n\"POLaunchDate\": \"2018-06-23T18:25:45.511Z\",\r\n\"PODepartment\": {\r\n\"DepartmentCode\": 301,\r\n\"DepartmentDesc\":\"Mens\"\r\n},\r\n\"POProductCode\": \"64778\",\r\n\"POVendor\": {\r\n\"VendorCode\": \"1000009683\",\r\n\"WalmartVendorCode\": \"01197234\"\r\n},\r\n\"POVendorFactory\": \"1000000022\",\r\n\"POPaymentTerms\": {\r\n\"PaymentTermsCode\": \"ZF09\",\r\n\"CurrencyCodeDesc\": \"GBP\"\r\n},\r\n\"POBuyerID\": \"100\",\r\n\"PODelivery\": [\r\n{\r\n\"PODeliveryNo\": 01,\r\n\"PODeliveryShipmentDate\": \"2018-03-10T11:00:00Z\",\r\n\"POArticle\": [\r\n{\r\n\"POReference\": \"10\",\r\n\"POArticleSortSeq\": \"1\",\r\n                        \"POArticleID\": \"000000001000000251\",\r\n\"POArticleActionCode\": \"001\",\r\n\"POArticleColour\": \"051\",\r\n\"POArticleLook\": \"1000000001\",\r\n\"POArticleLicenseCode\": \"\",\r\n\"POArticleCategory\": \"340001\",\r\n\"POArticleShippingInstruction\": \"S1\",\r\n"
				+ "\"POArticleIdent\": \"1234111111234112\",\r\n\"POArticleSizeDesc\": \"TEST\",\r\n"
				+ "\"POArticleContractCost\": 1.1,\r\n\"POArticleFactoryCost\": 2.2,\r\n\"POArticleQty\": 50,\r\n"
				+ "\"POArticleUoM\": \"123\",\r\n\"POArticleTotalCtns\": 10,\r\n"
				+ "\"PODeliveryUoM\": \"456\",\r\n\"POArticleVCP\": 2,\r\n\"POArticleSeasonRange\": \"AW18\",\r\n"
				+ "\"POArticleSeasonality\": \"seaso\",\r\n\"POArticleForecastDelDate\": \"2018-06-23T18:25:43.511Z\",\r\n"
				+ "\"POArticleRefurbCode\": \"Changed\",\r\n\"POArticleRefurbCost\": 23.2,\r\n"
				+ "\"POArticleLandedCost\": 100.2,\r\n\"WalmartItemNumber\": \"8439386\",\r\n"
				+ "\"WINStatus\": \"w\",\r\n\"POArticleCoO\": \"CH\",\r\n\"POArticlePoE\": \"BE\",\r\n"
				+ "\"POModeofTransport\": \"Sea\",\r\n\"POArticlePriority\": \"Pr2\",\r\n\"POArticlePnP\": {\r\n"
				+ "\"PnPSizeCode\": \"SizeCode1\",\r\n\"PnPLabelCode\": \"LabelCode1\",\r\n"
				+ "\"PnPCare\": \"Care1\",\r\n\"PnPCare2\": \"Care2\",\r\n\"PnPCare3\": \"Care3\",\r\n"
				+ "\"PnPCareIns\": \"CareIns1\",\r\n\"PnPCareIns2\": \"CareIns2\",\r\n\"PnPCareIns3\": \"CareIns3\",\r\n"
				+ "\"PnPCareIns4\": \"CareIns4\",\r\n\"PnPCareIns5\": \"CareIns5\",\r\n\"PnPTicket\": \"Ticket1\",\r\n"
				+ "\"PnPSTPos\": \"Pos1\",\r\n\"PnPLozRef\": \"LozRef1\",\r\n\"PnPExtra\": \"Extra1\",\r\n"
				+ "\"PnPExtra2\": \"Extra2\",\r\n\"PnPExtra3\": \"Extra3\",\r\n"
				+ "\"PnPExtra4\": \"Extra4\",\r\n\"PnPExtra5\": \"Extra5\",\r\n\"PnPBagCode\": \"BagCode1\",\r\n"
				+ "\"PnPHangCode\": \"HangCode1\",\r\n\"PnPHangCode2\": \"HangCode2\",\r\n\"PnPHangCode3\": \"HangCode3\",\r\n"
				+ "\"PnPHangCode4\": \"HangCode4\",\r\n\"PnPLogoCode\": \"LogoCode\",\r\n\"PnPLogoCode2\": \"LogoCode1\",\r\n"
				+ "\"PnPLogoCode3\": \"LogoCode2\",\r\n\"PnPQuality\": \"Quality1\",\r\n\"PnPWash\": \"Wash1\",\r\n"
				+ "\"PnPPromoInnerLabel\": \"PIL1\",\r\n\"PnPPromoOuterLabel\": \"POL1\",\r\n\"PnPSizeDesc\": \"SizeDesc1\",\r\n"
				+ "\"PnPSizeDesc2\": \"SizeDesc2\",\r\n\"PnPSizeDesc3\": \"SizeDesc3\",\r\n\"PnPSizePrefix\": \"SIzePrefix1\",\r\n"
				+ "\"PnPTUC\": \"TUC1\",\r\n\"PnPBarcode\": \"Barcode1\",\r\n\"PnPHgrLozCode\": \"HgrLozCode1\"\r\n"
				+ "}\r\n},\r\n\t\t\t\t\t{\"POReference\": \"11\",\r\n\"POArticleSortSeq\": \"2\",\r\n\"POArticleID\": \"000001000000251003\",\r\n\"POArticleActionCode\": \"001\",\r\n\"POArticleColour\": \"051\",\r\n\"POArticleLook\": \"1000000001\",\r\n\"POArticleLicenseCode\": \"\",\r\n\"POArticleCategory\": \"Variant\",\r\n                        \"POArticleShippingInstruction\": \"S1\",\r\n                        \"POArticleIdent\": \"1234111111234112\",\r\n"
				+ "\"POArticleSizeDesc\": \"10R\",\r\n\"POArticleContractCost\": 1.1,\r\n\"POArticleFactoryCost\": 2.2,\r\n"
				+ "\"POArticleQty\": 50,\r\n\"POArticleUoM\": \"M01\",\r\n\"POArticleTotalCtns\": 10,\r\n\"PODeliveryUoM\": \"456\",\r\n\"POArticleVCP\": 2,\r\n\"POArticleSeasonRange\": \"AW18\",\r\n\"POArticleSeasonality\": \"seaso\",\r\n\"POArticleForecastDelDate\": \"2018-06-20T18:25:43.511Z\",\r\n\"POArticleRefurbCode\": \"Changed\",\r\n                        \"POArticleRefurbCost\": 23.2,\r\n                        \"POArticleLandedCost\": 100.2,\r\n                        \"WalmartItemNumber\": \"55050469\",\r\n                        \"WINStatus\": \"w\",\r\n                        \"POArticleCoO\": \"CH\",\r\n                        \"POArticlePoE\": \"BE\",\r\n                        \"POModeofTransport\": \"Sea\",\r\n                        \"POArticlePriority\": \"Pr2\",\r\n                        \"POArticlePnP\": {\r\n                            \"PnPSizeCode\": \"SizeCode1\",\r\n                            \"PnPLabelCode\": \"LabelCode1\",\r\n                            \"PnPCare\": \"Care1\",\r\n                            \"PnPCare2\": \"Care2\",\r\n                            \"PnPCare3\": \"Care3\",\r\n                            \"PnPCareIns\": \"CareIns1\",\r\n                            \"PnPCareIns2\": \"CareIns2\",\r\n                            \"PnPCareIns3\": \"CareIns3\",\r\n                            \"PnPCareIns4\": \"CareIns4\",\r\n                            \"PnPCareIns5\": \"CareIns5\",\r\n                            \"PnPTicket\": \"Ticket1\",\r\n                            \"PnPSTPos\": \"Pos1\",\r\n                            \"PnPLozRef\": \"LozRef1\",\r\n                            \"PnPExtra\": \"Extra1\",\r\n                            \"PnPExtra2\": \"Extra2\",\r\n                            \"PnPExtra3\": \"Extra3\",\r\n                            \"PnPExtra4\": \"Extra4\",\r\n                            \"PnPExtra5\": \"Extra5\",\r\n                            \"PnPBagCode\": \"BagCode1\",\r\n                            \"PnPHangCode\": \"HangCode1\",\r\n                            \"PnPHangCode2\": \"HangCode2\",\r\n                            \"PnPHangCode3\": \"HangCode3\",\r\n                            \"PnPHangCode4\": \"HangCode4\",\r\n                            \"PnPLogoCode\": \"LogoCode\",\r\n                            \"PnPLogoCode2\": \"LogoCode1\",\r\n                            \"PnPLogoCode3\": \"LogoCode2\",\r\n                            \"PnPQuality\": \"Quality1\",\r\n                            \"PnPWash\": \"Wash1\",\r\n                            \"PnPPromoInnerLabel\": \"PIL1\",\r\n                            \"PnPPromoOuterLabel\": \"POL1\",\r\n                            \"PnPSizeDesc\": \"SizeDesc1\",\r\n"
				+ "\"PnPSizeDesc2\": \"SizeDesc2\",\r\n\"PnPSizeDesc3\": \"SizeDesc3\",\r\n\"PnPSizePrefix\": \"SIzePrefix1\",\r\n\"PnPTUC\": \"TUC1\",\r\n\"PnPBarcode\": \"Barcode1\",\r\n"
				+ "\"PnPHgrLozCode\": \"HgrLozCode1\"\r\n\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n],\r\n\"PODeliveryComplete\": \"\"\r\n}\r\n\r\n]\r\n}\r\n}";

	@Test
	public void intData() throws IOException{
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = RequestBody.create(mediaType,json);
		Request request = new Request.Builder()
		  .url("https://st-georgefoundation.adjuno.net/?Action=WebService&API=AddToQueue&Operation=Store&MessageType=I0028&Format=json&Priority=2")
		  .post(body)
		  .addHeader("authorization", "84f4cc35ea124ca6ba62b6cfd47e5f97")
		  .addHeader("content-type", "application/json; charset=utf-8")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "f79a744d-bd47-fa6c-0fbd-91d2de859ec8")
		  .build();

		okhttp3.Response response = client.newCall(request).execute();
	
		//System.out.println("body0 "+ response.cacheResponse());
		System.out.println("body1 "+ response.request().body().toString());
		System.out.println("body2 "+ response.networkResponse().toString());
		System.out.println("status code " + response.code());
		System.out.println("status code7 " + response.message());
		
	
	}


}

