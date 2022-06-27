package com.day21;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			
			//DOM객체를 생성하기 위한 팩토리 생성
			//XML을 담는 class
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			
			//입력받은 파일을 파싱하도록 요청하는 클래스
			//파싱: 어떤 페이지(문서,html)에서 내가 원하는 데이터를 특정 패턴 혹은 순서로 추출해 가공
			//어떤 데이터를 원하는 폼으로 만들어 내는 것
			
			Document xmlDoc = null;
			
			String url = "book.xml";	//공유 API 사용하는 경우 End point url을 기입
			
			if (url.indexOf("https://")!=-1) {	//있을 경우 원격 데이터, 없을경우 로컬 데이터
				
				URL u = new URL(url);
				InputStream is = u.openStream();	//openstream을 이용하여 is를 받아냄
				xmlDoc = parser.parse(is);
			}else {	//로컬의 경우. open으로 받아내지 않고도 바로 읽어내어 xmlDoc에 담기 가능
				xmlDoc = parser.parse(url);
			}
			
			//Element : XML 문서의 요소를 표현하기위해 사용
			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName());
			
			//첫번째 book
			//Node : 각 요소를 읽고 쓰기위해 사용
			
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element)book1).getAttribute("kind"));	//downcast로 출력
			
			Node title = book1.getFirstChild();
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName());
			Node title2 = title1.getFirstChild();
			System.out.println(title2.getNodeValue());
			
			String out = "";
			String str = "";
			
			NodeList books = root.getElementsByTagName("book");
			for(int i=0; i<books.getLength();i++) {
				Node book = books.item(i);
				str = book.getNodeName();
				
				out += "노드명: " + str;
				
				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();
				
				out += ", kind: " + str;
				
				NodeList elementList = book.getChildNodes();
				                                 
				for(int j=0; j<elementList.getLength(); j++) {
					
					Node e = elementList.item(j);
					
					str = "";
					
					
					if(e.getNodeType()==Node.ELEMENT_NODE) {
						str = ", " + e.getNodeName();
						out += str + ":";
						out += e.getChildNodes().item(0).getNodeValue();
						
						
					}
				}
				
				out += "\n";
				
			}
			
			System.out.println(out);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
