package com.xukaiqiang.blog.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	/********************************************************
	  ��    �ܣ�����һ���ַ���ȥ���ұ߿ո���ֵ�����Ϊnull�򷵻ؿմ�
	  ��ڲ�����param str:��������ַ���
	  ���ڲ�����
	  ��    �أ�ȥ���ұ߿ո����ַ������߿մ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String getValue(String str)
	{
		if (str==null) {return "";}
		if (str.trim().length()<=0) return "";
		str="H"+str;
		str=str.trim();
		str=str.substring(1);
		return str;
	}
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ�Ϊ��ֵ��null���߿մ���
	  ��ڲ�����param str:���жϵ��ַ���
	  ���ڲ�����
	  ��    �أ�true���գ�false���ǿ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isStrEmpty(String str) {
		if ( (str == null) || (str.equals(""))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ���ȥ���ո���Ƿ�Ϊ��ֵ��null���߿մ���
	  ��ڲ�����param str:���жϵ��ַ���
	  ���ڲ�����
	  ��    �أ�true���գ�false���ǿ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isStrTrimEmpty(String str) {
		if ( str == null || str.trim().equals("")) {
			return true;
		}
		else {
			return false;
		}
	}

	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ񳬳���������
	  ��ڲ�����param text:���жϵ��ַ�����param len:�����ĳ���
	  ���ڲ�����
	  ��    �أ�return true��δ������false��Ϊ�ջ��߳���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean chkTextLen(String text, int len) {
		if (text==null || text.length() > len) {
			return false;
		}
		else {
			return true;
		}
	}

	/********************************************************
	  ��    �ܣ��ж�һ���ַ���ȥ���ո��Ƿ񳬳���������
	  ��ڲ�����param text:���жϵ��ַ�����param len:�����ĳ���
	  ���ڲ�����
	  ��    �أ�return true��δ������false��Ϊ�ջ��߳���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean chkTextTrimLen(String text, int len) {
		if (text==null || text.trim().length() > len) {
			return false;
		}
		else {
			return true;
		}
	}

	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ�ֻ��english
	  ��ڲ�����param text:���жϵ��ַ�����
	  ���ڲ�����
	  ��    �أ�return true���Ϸ���false:�������Ļ��������Ƿ��ַ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isStrEn(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) > 127) {
				return false;
			}
		}
		return true;
	}
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ�����
	  ��ڲ�����param ch:���жϵ��ַ�
	  ���ڲ�����
	  ��    �أ�return true�����֣�false:������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isCharNum(char ch) {
		if (ch > 47 && ch < 58) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ��з����ֵ��ַ�
	  ��ڲ�����param str:���жϵ��ַ���
	  ���ڲ�����
	  ��    �أ�return true��Null���߲�ȫ�����֣�false:ȫ������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isStrNum(String str) {
		if (isStrEmpty(str)) {
			return true;
		}
		boolean notNum = false;
		for (int i = 0; i < str.length(); i++) {
			if (!isCharNum(str.charAt(i))) {
				notNum = true;
			}
		}
		return !notNum;
	}
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ��з����ֵ��ַ�
	  ��ڲ�����param strSrc:���жϵ��ַ���
	  ���ڲ�����
	  ��    �أ�return true��ȫ�����֣�false:��ȫ������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isNum(String strSrc) throws Exception {
		for (int i = 0; i < strSrc.length(); i++) {
			if (!isCharNum(strSrc.charAt(i)))
				return false;
	    }
	    return true;
	}
	
	/********************************************************
	  ��    �ܣ��ж�һ���ַ��Ƿ���Ӣ����ĸ
	  ��ڲ�����param ch:���жϵ��ַ�
	  ���ڲ�����
	  ��    �أ�return true����Ӣ����ĸ��false:����Ӣ����ĸ
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isCharLetter(char ch) {
		if ( (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			return true;
		}
		else {
			return false;
		}
	}

	/********************************************************
	  ��    �ܣ��ж�һ���ַ����Ƿ�ȫ��Ӣ����ĸ
	  ��ڲ�����param str:���жϵ��ַ���
	  ���ڲ�����
	  ��    �أ�return true��NULL���з�Ӣ����ĸ��false:ȫ��Ӣ����ĸ
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static boolean isStrLetter(String str) {
		if (isStrEmpty(str))
			return true;
		boolean notLetter = false;
		for (int i = 0; i < str.length(); i++) {
			if (!isCharLetter(str.charAt(i))) {
				notLetter = true;
			}
		}
		return !notLetter;
	}

	/********************************************************
	  ��    �ܣ����紫����ַ�����null��ת�ɿմ������򷵻�ԭ�ַ���
	  ��ڲ�����param Content:��ת�����ַ���
	  ���ڲ�����
	  ��    �أ�����ַ�����null��ת�ɿմ������򷵻�ԭ�ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public String nullToSpace(String Content) {
		if (Content == null) {
			Content = "";
		}
		return Content;
	}
	  
	/********************************************************
	  ��    �ܣ���������ַ���ȡ����һ���ַ�����
	  ��ڲ�����param src:������ַ���
	  ���ڲ�����
	  ��    �أ�return ��������ַ���ȡ����һ���ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static char StrToChar(String src) {
		src = src.trim();
		char result = src.charAt(0);
		return result;
	}
	
	/********************************************************
	  ��    �ܣ���������ַ���ת�ɶ�Ӧ��ASCII�봮
	  ��ڲ�����param sql:�������sql������
	  ���ڲ�����
	  ��    �أ��������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String encodeSQL(String sql) {
		StringBuffer tempBuff = new StringBuffer();
		for (int i = 0; i < sql.length(); i++) {
			tempBuff.append(Integer.toHexString(sql.charAt(i)));
		}
		return tempBuff.toString();
	}

	/********************************************************
	  ��    �ܣ��������ASCII�봮����Ϊ��Ӧ���ַ���
	  ��ڲ�����param encoded:��������ַ���
	  ���ڲ�����
	  ��    �أ��������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String decodeSQL(String encoded) {
		StringBuffer tempBuff = new StringBuffer();
		for (int i = 0; i < encoded.length(); i += 2) {
			tempBuff.append((char) Integer.parseInt(
					encoded.substring(i, i + 2), 16));
		}
		return tempBuff.toString();
	}
	
	/********************************************************
	  ��    �ܣ���ȡ���·��
	  ��ڲ�����param path1:����·����param context1:������
	  ���ڲ�����
	  ��    �أ�return ���·��
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String getAbsolutePath(String path1,String context1)
	{
		int i1=path1.indexOf(context1);
		if (i1<0) {return path1;}
		else {
			return path1.substring(path1.indexOf(context1)+context1.length());
		}
	}
	
	/********************************************************
	  ��    �ܣ���ȡ�Ӵ�
	  ��ڲ�����param str1:��ȡ�Ӵ����ַ�����param sindex:��ʼλ�ã�param eindex:����λ��
	  ���ڲ�����
	  ��    �أ����ش���ʼλ�ÿ�ʼ����λ�ý������Ӵ����������λ��С��0���򷵻ش���ʼλ�ÿ�ʼ���Ӵ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String getSubString(String str1,int sindex,int eindex)
	{
		if (str1==null) {return "";}
	    if (str1.trim().length()<=0) return "";
	    if (str1.length()>sindex)
	    {
	      if (eindex>=0)
	      return str1.substring(sindex, eindex);
	      else if (eindex<0)
	      return str1.substring(sindex);
	    }
	    return "";
	}
	

	  

	
	
	/********************************************************
	  ��    �ܣ����ַ����������䵽ָ���Ĵ�С��������ÿմ�����
	  ��ڲ�����param strs:��������ַ������飬param size1:���������鳤��
	  ���ڲ�����
	  ��    �أ�return �������ַ�������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
	public static String[] getValues(String[] strs,int size1)
	{
	    String[] strs1=new String[size1];
	    for (int i=0;i<size1;i++)
	    {
	      strs1[i]="";
	    }
	    if  (strs==null) { return strs1;}
	    else {
	      if (strs.length<size1)
	      {
	         for (int i=0;i<strs.length;i++)
	         {
	           strs1[i]=strs[i];
	         }
	         return strs1;
	      }
	      else {
	        return strs;
	      }
	    }
	}
	
	/********************************************************
	  ��    �ܣ��ַ���ȫ���滻����
	  ��ڲ�����param strSource  ���滻���ַ�����param strFrom  Դ�ַ�����param strTo  Ŀ���ַ���
	  ���ڲ�����
	  ��    �أ��滻����ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String replaceStrAll(String strSource,String strFrom,String strTo)
    {
    	String strDest = "";
    	int intFromLen = strFrom.length();
    	int intPos;
    	while((intPos = strSource.indexOf(strFrom)) != -1)
    	{
             strDest = strDest + strSource.substring(0,intPos);
             strDest = strDest + strTo;
             strSource = strSource.substring(intPos + intFromLen);
    	}
    	strDest = strDest + strSource;
    	return strDest;
    }
    
    /********************************************************
	  ��    �ܣ��ѻ��з��滻��ָ�����ַ���
	  ��ڲ�����param strTarget  ��������ַ�����param strNew  Ҫ���\n�Ĵ�
	  ���ڲ�����
	  ��    �أ��滻����ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/

    public static String replaceStr(String strTarget, String strNew) {

      int iIndex = -1;
      while (true) {

        iIndex = strTarget.indexOf('\n');

        if (iIndex < 0) {
          break;
        }

        String strTemp = null;
        strTemp = strTarget.substring(0, iIndex);

        strTarget = strTemp + strNew + strTarget.substring(iIndex + 1);

      }

      return strTarget;

    }
    
    /********************************************************
	  ��    �ܣ��ж��ַ����������Ƿ��и��ַ���
	  ��ڲ�����param str1 ��Ѱ�ҵ��ַ�����param strarray ��Ѱ�ҵ��ַ������飬
	  ���ڲ�����
	  ��    �أ�return true������;false��δ����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static boolean includestr(String str1,String[] strarray)
    {
    	if (strarray==null || strarray.length<=0) return false;
    	for (int i=0;i<strarray.length;i++)	
    	{
    		if (strarray[i]==null)
    		{
    			if (str1==null) return true;
    			else continue;	
    		} 
    		if (strarray[i].trim().equals(str1))
    		{
    			return true;	
    		}	
    	}
    	return false;
    }
    
    /********************************************************
	  ��    �ܣ���\n��Ϊ�ָ��������ַ����ָ������飬��ȥ��\r
	  ��ڲ�����param fvalue ��ת�����ַ���
	  ���ڲ�����
	  ��    �أ�return ת���������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String[] getAreaValues(String fvalue)
    {
       String tmpstr=fvalue;
       int i=0;
       if (tmpstr==null) return null;
       if (tmpstr.trim().equals("")) return null;
       while (tmpstr.indexOf("\n")>=0)
       {i++;
        tmpstr=tmpstr.substring(tmpstr.indexOf("\n")+1);
       }
       if (tmpstr.trim().equals("")) {i--;}
       String[] fvalues=new String[i+1];
       tmpstr=fvalue;
       i=0;
       while (tmpstr.indexOf("\n")>=0)
       {
          fvalues[i]=tmpstr.substring(0,tmpstr.indexOf("\n"));
          if (fvalues[i].indexOf("\r")>=0) fvalues[i]=fvalues[i].substring(0,fvalues[i].indexOf("\r"));
          i++;
          tmpstr = tmpstr.substring(tmpstr.indexOf("\n") + 1);
       }
       if (!tmpstr.trim().equals(""))
       fvalues[i]=tmpstr;
       return fvalues;
    }
    
    /********************************************************
	  ��    �ܣ����ַ����е�|ת�ɴ�\n
	  ��ڲ�����param fvalue ��ת�����ַ���
	  ���ڲ�����
	  ��    �أ�ת������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String getrealAreaValues(String fvalue)
    {
       String tmpstr=fvalue;
       String returnstr="";
       if (tmpstr==null) return null;
       if (tmpstr.trim().equals("")) return "";
       while (tmpstr.indexOf("|")>0)
       {
        returnstr+=tmpstr.substring(0,tmpstr.indexOf("|"))+"\n";
        tmpstr=tmpstr.substring(tmpstr.indexOf("|")+1);
       }
       return returnstr;
    }
    
    /********************************************************
	  ��    �ܣ������ַ����к��е�ָ���ַ��ĸ���
	  ��ڲ�����param strInput ��������ַ�����param chr ��Ѱ�ҵ��ַ�
	  ���ڲ�����
	  ��    �أ�return ������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static int CountChar(String strInput, char chr) {
      int iCount = 0;
      char chrTmp = ' ';
      
      if (strInput.trim().length()==0)
          return 0;
      //����ָ�����ٸ��ַ���
      for (int i = 0; i < strInput.length(); i++) {
        chrTmp = strInput.charAt(i);
        if (chrTmp == chr) {
          iCount++;
        }
      }
      return iCount;
    }
   
    
    /********************************************************
	  ��    �ܣ�����ά����ת��һ���ַ����ͳ�
	  ��ڲ�����param strs ��ת�����ַ�������
	  ���ڲ�����
	  ��    �أ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String StrArrayToStr(String[] strs) {
    	StringBuffer returnstr=new StringBuffer("");
    	if (strs==null) return "";
    	for (int i = 0; i < strs.length; i++) {
    		returnstr.append(strs[i]);
    	}
    	return returnstr.toString();
    }
    /********************************************************
	  ��    �ܣ����еĴ�ӡ���ַ������������
	  ��ڲ�����param strs ����ӡ���ַ�������
	  ���ڲ�����
	  ��    �أ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static void printStrs(String[] strs) {
      for (int i = 0; i < strs.length; i++) {
        System.out.println(strs[i]);
      }
    }
    
    /********************************************************
	  ��    �ܣ���ά�����У�һά���еĴ�ӡ���ַ������������
	  ��ڲ�����param strs ����ӡ�Ķ�ά�ַ�������
	  ���ڲ�����
	  ��    �أ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static void printDualStr(String[][] dualStr) {
      for (int i = 0; i < dualStr.length; i++) {
        for (int j = 0; j < dualStr[i].length; j++) {
          System.out.print(dualStr[i][j] + " ");
        }
        System.out.println();
      }
    }
    
    /********************************************************
	  ��    �ܣ�����ά��������ߵ������б�Ϊ�У����б�Ϊ��
	  ��ڲ�����param dualStr ����Ķ�ά����
	  ���ڲ�����
	  ��    �أ�return �ߵ���Ķ�ά����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String[][] rowToColumn(String[][] dualStr) {
      String[][] returnDualStr = null;
      if (dualStr != null) {
        returnDualStr = new String[dualStr[0].length][dualStr.length];
        for (int i = 0; i < dualStr.length; i++)
          for (int j = 0; j < dualStr[0].length; j++)
            returnDualStr[j][i] = dualStr[i][j];
      }
      return returnDualStr;
    }
    
    /********************************************************
	  ��    �ܣ���Ҫ��ֵ��ҳ����ʾ���String�����е������ַ�����ת���
	  ��ڲ�����param inStr ������ַ���
	  ���ڲ�����
	  ��    �أ�return ���ת�������ַ���  
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String latinString(String inStr) {
        String res=inStr;
        if(null==res)	return null;
        res=replaceStrAll(res,"\"","\\\"");
        res=replaceStrAll(res,"'","\\'");
        return res;
    }
    
    /********************************************************
	  ��    �ܣ����ַ������пո��滻��ָ����
	  ��ڲ�����param String strTarget, String strNew
	  ���ڲ�����
	  ��    �أ�return String �����ѱ��滻���ִ�
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String replaceWhiteSpace(String strTarget, String strNew) {

      int iIndex = -1;
      while (true) {
        char cRep = 32;
        iIndex = strTarget.indexOf(cRep);

        if (iIndex < 0) {
          break;
        }

        String strTemp = null;
        strTemp = strTarget.substring(0, iIndex);

        strTarget = strTemp + strNew + strTarget.substring(iIndex + 1);

      }

      return strTarget;

    }
   
    /********************************************************
	  ��    �ܣ�������д�ɷ���Ҫ���С����λ����ֻȥ�������С����λ��������չλ����
	  ��ڲ�����param amount ����Ľ��, param length ָ����С��λ����
	  ���ڲ�����
	  ��    �أ�return ���ת�������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String double2str(double amount, int length) {
        String strAmt = Double.toString(amount);

        int pos = strAmt.indexOf('.');

        if (pos != -1 && strAmt.length() > length + pos + 1)
          strAmt = strAmt.substring(0, pos + length + 1);

        return strAmt;
    }
    
    /********************************************************
	  ��    �ܣ�����chr�ָ��ַ�������ΪString���Դ���split��֧����"|"Ϊ�ָ����
	  ��ڲ�����param str ��Ҫ���ָ�Ĵ�,param chr �ָ����
	  ���ڲ�����
	  ��    �أ�return String[] �ָ����ַ�������,���������һ��|������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String[] doSplit(String str, char chr) {
      int iCount = 0;
      char chrTmp = ' ';
      //����ָ�����ٸ��ַ���
      for (int i = 0; i < str.length(); i++) {
        chrTmp = str.charAt(i);
        if (chrTmp == chr) {
          iCount++;
        }
      }
      String[] strArray = new String[iCount];
      for (int i = 0; i < iCount; i++) {
        int iPos = str.indexOf(chr);
        if (iPos == 0) {
          strArray[i] = "";
        }
        else {
          strArray[i] = str.substring(0, iPos);
        }
        str = str.substring(iPos + 1); //��iPos+1������,str��������С
      }
      return strArray;
    }

    /********************************************************
	  ��    �ܣ�����s�ָ��ַ�������ΪString���Դ���split��֧����"|"Ϊ�ָ����
	  ��ڲ�����param str ��Ҫ���ָ�Ĵ�,param s �ָ����
	  ���ڲ�����
	  ��    �أ�return String[] �ָ����ַ�������,�������һ��|������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
/******** mark by yebin 20051220
    public static String[] SplitStr(String str,char s)
    {
      String[] t=null;
      char[] c=null;
      StringBuffer x=new StringBuffer();
      int i,j,n,k;
      t=null;
      if(str==null) return null;
      if(str.length()==0)return null;
      c=str.toCharArray();
      n=c.length;
      for(j=0,i=0;i<n;i++)
      {
        if(c[i] == s)
        {
          j++;
        }
      }
      t=new String[j+1];
      for(k=0,j=0,i=0;i<n;i++)
      {
         if(c[i] == s)
         {
            t[j]=str.substring(k,i);
            j++;
            k=i+1;
         }
      }
      t[j]=str.substring(k,i);
      return t;
    }
******************/
    
    /********************************************************
	  ��    �ܣ�����strSeparator�ָ��ַ�����ֻ�ָ���ָ����С���ַ���
	  ��ڲ�����param strToSplit ��Ҫ���ָ�Ĵ�,param strSeparator �ָ��ַ���,param iLimit ָ����С
	  ���ڲ�����
	  ��    �أ�return String[] �ָ����ַ�������
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String[] split(String strToSplit, String strSeparator, int iLimit) {
    	java.util.ArrayList tmpList = new java.util.ArrayList();
    	int iFromIndex = 0;
    	int iCurIndex = strToSplit.length();
    	String strUnitInfo = "";
    	int iCurCounts = 0;
    	while ( (iCurIndex != -1) && (iFromIndex <= strToSplit.length()) &&
           (iCurCounts < iLimit)) {
    		iCurIndex = strToSplit.indexOf(strSeparator, iFromIndex);
    		if (iCurIndex == -1) {
    			strUnitInfo = strToSplit.substring(iFromIndex, strToSplit.length());
    		}
    		else {
    			strUnitInfo = strToSplit.substring(iFromIndex, iCurIndex);
    			iFromIndex = iCurIndex + strSeparator.length();
    		}
    		tmpList.add(strUnitInfo);
      	iCurCounts++;
    	}
    	int iCounts = tmpList.size();
    	String tmpArray[] = new String[iCounts];
    	for (int i = 0; i < iCounts; i++) {
    		tmpArray[i] = (String) tmpList.get(i);
    	}
    	return tmpArray;
    }

    /********************************************************
	  ��    �ܣ����ַ�����С��ָ�����ȣ�����Ĳ�����...����
	  ��ڲ�����param src ��Ҫ������Ĵ�,param len  ָ����С
	  ���ڲ�����
	  ��    �أ�return String ��С��ָ�����ȣ�����Ĳ�����...�������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String strIntercept(String src, int len) {
    	if (src == null) {
    		return "";
    	}
    	if (src.length() > len) {
    		src = String.valueOf(String.valueOf(src.substring(0, len))).concat(
          "...");
    	}
    	return src;
    }

    /********************************************************
	  ��    �ܣ����ַ���ת��ISO8859_1����
	  ��ڲ�����param str_in Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String strtochn(String str_in) {
    	try {
    		String temp_p = str_in;
    		if (temp_p == null) {
    			temp_p = "";
    		}
    		String temp = "";
    		if (!temp_p.equals("")) {
    			byte[] byte1 = temp_p.getBytes("ISO8859_1");
    			temp = new String(byte1);
    		}
    		return temp;
    	}
    	catch (Exception e) {
    	}
    	return "null";
    }

    /********************************************************
	  ��    �ܣ���ISO8859_1�ַ���ת��GBK����
	  ��ڲ�����param strvalue Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String ISO2GBK(String strvalue) {
    	try {
    		if (strvalue == null)
    			return null;
    		else {
    			strvalue = new String(strvalue.getBytes("ISO8859_1"), "GBK");
    			return strvalue;
    		}
    	}
    	catch (Exception e) {
    		return null;
    	}
    }
    
    /********************************************************
	  ��    �ܣ���GBK�ַ���ת��ISO8859_1����
	  ��ڲ�����param strvalue Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public String GBK2ISO(String strvalue) throws Exception {
    	try {
    		if (strvalue == null)
    			return null;
    		else {
    			strvalue = new String(strvalue.getBytes("GBK"), "ISO8859_1");
    			return strvalue;
    		}
    	}
    	catch (Exception e) {
    		return null;
    	}
    }

    /********************************************************
	  ��    �ܣ���ҳ��Ҫ��ʾ���Ķ�����б���ת��
	  ��ڲ�����param str Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static String cnCodeTrans(String str) {
    	String s = "";
    	try {
    		s = new String(str.getBytes("GB2312"), "8859_1");
    	}
    	catch (UnsupportedEncodingException a) {
    		System.out.print("chinese thansform exception");
    	}
    	return s;
    }
    /********************************************************
	  ��    �ܣ���ҳ��Ҫ�������Ķ������ת�봦��
	  ��ڲ�����param str Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
  public static String chiEnUTF8(String str) {
  	String s = "";
  	try {
  		s = new String(java.net.URLEncoder.encode(str,"UTF-8"));
  	}
  	catch (UnsupportedEncodingException a) {
  		System.out.print("chinese thansform exception");
  	}
  	return s;
  }
  
  /********************************************************
  ��    �ܣ���ҳ�洫�����Ķ�����н��봦����ת��ΪUTF-8
  ��ڲ�����param str Ҫ��������ַ�����
  ���ڲ�����
  ��    �أ�return String ת������ַ�����
  �� �� �ˣ�
  ��д���ڣ�20051220
  �޸ı�ע��
  ********************************************************/
public static String chiDeUTF8(String str) {
	String s = "";
	try {
		s = new String(java.net.URLDecoder.decode(str,"UTF-8"));
	    
		byte[] bytes = s.getBytes("ISO-8859-1");    
	    s = new String(bytes, "UTF-8"); 
	}
	catch (UnsupportedEncodingException a) {
		System.out.print("chinese thansform exception");
	}
	return s;
} 
  
    /********************************************************
	  ��    �ܣ��ж�Դ���Ƿ���Ϲ�������STaaaa����ST******
	  ��ڲ�����param strSourceҪ��������ַ�����param strRule����
	  ���ڲ�����
	  ��    �أ�return false:Դ����ƥ�����true:Դ��ƥ�����
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
    public static boolean judgeMatch(String strSource, String strRule) {
    	int i = 0;
    	//Դ�������ж�
    	if ( (null == strSource) || (strSource.length() == 0))
    		return false;
    	//���򴮳����ж�
    	if ( (null == strRule) || (strRule.length() == 0))
    		return false;
    	//���Ȳ��ɳ���
    	if (strSource.length() > strRule.length())
    		return false;
    	//ÿһλ���ж�
    	for (i = 0; i < strRule.length(); i++) {
    		//Դ���ȹ��򴮶�
    		if (strSource.length() < i + 1) {
    			break;
    		}
    		if ( (strRule.charAt(i) != '*')
    				&& (strSource.charAt(i) != strRule.charAt(i))) {
    			return false;
    		}
    	}
    	//����Դ���ȹ��򴮶̵�����������򴮺��Ǿ�Ϊ'*'����ƥ�䲻��
    	for (; i < strRule.length(); i++) {
    		if (strRule.charAt(i) != '*')
    			return false;
    	}
    	return true;
  }
    
    /********************************************************
	  ��    �ܣ��ж��ַ��������һλ�Ƿ��е����İ�������룬��ȥ���ǰ��������
	  ��ڲ�����param strSourceҪ��������ַ�����
	  ���ڲ�����
	  ��    �أ�ȥ������������Ĵ�;
	  �� �� �ˣ�
	  ��д���ڣ�20051220
	  �޸ı�ע��
	  ********************************************************/
  public static String getFullChnStr(String strSource) {
  	//Դ�������ж�
  	if ( (null == strSource) || (strSource.length() == 0))
  		return "";
  	//�������Ϊ1��ֻ��Ҫ�жϵ�һλ�Ƿ������ľͿ�����
  	if (strSource.length()==1)
  	{
  		if (strSource.charAt(0) > '\177')
  		{
  			return "";
  		} 
  		return strSource;
  	}
  	if (strSource.charAt(strSource.length()-2)<='\177' && strSource.charAt(strSource.length()-1) > '\177') {
		return strSource.substring(0,strSource.length()-1);
	}
  	
  	boolean prechn=false;
  	String returnstr="";
  	for (int i=0;i<strSource.length();i++)
  	{
  		//�����i���ַ����Ǻ���
  		if (strSource.charAt(i)<='\177')
  		{
  			//���ǰ���а�����֣���ȥ��ǰ���ǰ������
  			if (prechn)
  			{
  				returnstr=returnstr.substring(0,returnstr.length()-1);
  				
  			} 
  			returnstr=returnstr+strSource.charAt(i);
  			prechn=false;
  		} else {
            //���ǰ���а�����֣���պ���ϳ�һ��
  			returnstr=returnstr+strSource.charAt(i);
            if (prechn)
            {
            	prechn=false;
            } else {
            	prechn=true;
            }
  		}
  	}
  	if (prechn)
  	{
  		returnstr=returnstr.substring(0,returnstr.length()-1);
  	}
  	return returnstr;
  }
  
  /********************************************************
	  ��    �ܣ��ж������ѯ��������'ʱ�Ƿ���Ϲ�������PEOPLE'Sת��ΪPEOPLE''S
	  ��ڲ�����String qryStrҪ��������ַ���
	  ���ڲ�����
	  ��    �أ�return String ת������ַ���
	  �� �� �ˣ�
	  ��д���ڣ�20060823
	  �޸ı�ע��
	  ********************************************************/
    public static String filerQuery(String qryStr) {
		int comma = 0;		
		int len = 0;		
		String Str = "";
		
		comma = qryStr.indexOf("'");
		len = qryStr.length();	
		
		if (qryStr == ""){
		    Str = "";
		}else{
			if (comma >0){
				Str = qryStr.substring(0,comma) + "''" + qryStr.substring(comma+1,len);
		    }else if(comma == 0){
		    	Str = "''";
		    }else if(comma < 0){
		    	Str = qryStr;
		    }		    
		}
		return Str;
	}
    /********************************************************
	  ��    �ܣ��ڵ��ַ�����С����ǰÿ����λ�ö��Ÿ��� �磺23432525.00 ת���Ϊ23,432,525.00
	  ��ڲ�����param str Ҫ��������ַ�����
	  ���ڲ�����
	  ��    �أ�return String ת������ַ�����
	  �� �� �ˣ�
	  ��д���ڣ�20060823
	  �޸ı�ע�����Ǹ��������  modify by yczheng on 20070327
	  ********************************************************/
	public static String appendStr(String str) {
		
		int strlength=0;
		int adddot=0;
		int tmpstrlength=0;
		int callength=0;
		int plusdot=0;
		String firststr="";
		String endstr="";
		String returnStr=""; 
		String tmpfirststr="";
		String tmpendstr="";
		boolean isNegative = false;
		
		if(str.startsWith("-")){
			isNegative = true;
		}
		tmpstrlength=str.indexOf(".");//ͨ��"."�ָ�
		if(isNegative){
			firststr = str.substring(1,tmpstrlength);//��ȡ"-"��"."֮����ַ�
		}else{
			firststr=str.substring(0,tmpstrlength);//��ȡ"."֮ǰ���ַ�
		}
//		firststr=str.substring(0,tmpstrlength);//��ȡ"."֮ǰ���ַ�
		endstr=str.substring(tmpstrlength);//��ȡ"."֮����ַ�(����".")
		strlength=firststr.length();
		adddot=strlength/3;//�ж���Ҫ����","����;
		plusdot=strlength%3;
		if(plusdot==0)
		{
			adddot=adddot-1;
		}
		for(int i=0;i<adddot;i++)
		{
	
			callength=firststr.length();
			tmpfirststr=firststr.substring(0,callength-(4*i+3));//�õ���Ҫ��","��ǰ���ַ�
			tmpendstr=firststr.substring(callength-(4*i+3));//�õ���Ҫ��","������ַ�
			firststr=tmpfirststr+","+tmpendstr;	//�ϲ�
	
			
		}
		if(isNegative){
			returnStr = "-" + firststr + endstr;
		}else{
			returnStr=firststr+endstr;
		}
		return returnStr;
	}

	//�Ƚ�������\r\n�ָ����ַ�����С�Ƿ�һ�£�����Ļس�������,ÿ�ж���ұ߿ո���
	public static boolean CompareString(String str1,String str2)
	{
		if (str1.equals(str2))
		{
			return true;
		}
		if (str1.endsWith("\r\n") && str1.length()>2)
		{
			str1=str1.substring(0,str1.length()-2);
		} 
		if (str2.endsWith("\r\n") && str2.length()>2)
		{
			str2=str2.substring(0,str2.length()-2);
		} 
		if (str1.equals(str2))
		{
			return true;
		}
		return false;
	}
	
	 //���ַ����е�/r��/nȥ������������󳤶ȵ�ʱ��,�ͼ��Ϸָ���;
	public static String SepFormatStr(String SourceStr,int maxlength,String separator)
	{
		if(SourceStr==null)return null;
		SourceStr = SourceStr.replaceAll("\r","");
		SourceStr = SourceStr.replaceAll("\n","");
		SourceStr = SourceStr.replaceAll(separator,"");
		//�Ƿ��ֱ�־
		boolean cnflag = false;
		//�Ƿ�ý�β��־
		boolean end = false;
		//Ҫ���ص�ת����Ľ����
		StringBuffer resultsb = new StringBuffer();
		//����󳤶����Ƶ���ʱ��
		StringBuffer tempsb = new StringBuffer();
		//����󳤶����Ƶ��м人��
		String tempstr = "";
		for(int i=0;i<SourceStr.length();i++)
		{
			char Cindex = SourceStr.charAt(i);
			//�ж��Ƿ�Ϊ�����ַ�
			if (Cindex > '\177')
			{
				//�ж���ǰ�ַ��Ƿ������ַ�
				if(cnflag)
				{				
					//�жϼ��Ϻ��ֺ��Ƿ�ᳬ����󳤶�
					if(tempsb.length()>=maxlength-1)
					{
						//����β����
						//�ж��Ƿ���ӷָ��
						if(resultsb.length()>0)
						{
							resultsb.append(separator);				
						}
						resultsb.append(tempsb);
						tempsb.delete(0,tempsb.length());
					}
					//��ֵ����󳤶����Ƶ��м人��
					tempstr =SourceStr.substring(i-1,i+1);
					//��ֵ����󳤶����Ƶ��м人�ָ��´�
					tempsb.append(tempstr);					
					cnflag = false;
				}else{
					cnflag =true;
				}
			}else
			{
				if(cnflag)
				{
					//�����ǰ�������ַ��������ǰ�������ַ�
					cnflag = false;
				}	
				//׷��ÿ���������ַ�
				tempsb.append(Cindex);
			}
			//����ַ�������������ý�β
			if(i==SourceStr.length()-1)end=true;
			//����β����
			if(tempsb.length()>0 && (tempsb.length()>=maxlength || end))
			{
				//�ж��Ƿ���ӷָ��
				if(resultsb.length()>0)
				{
					resultsb.append(separator);				
				}
				resultsb.append(tempsb);
				tempsb.delete(0,tempsb.length());
				end = false;
			}
		}			
		return resultsb.toString();
	}	
	
	

	
	//���������е��պ���
	public static String exchangeName(String strTmp)
	{
		String ori = strTmp.trim();
		if(ori != null)
		{
			if(ori.length()== 4 || ori.length() == 6)
			{
				if(ori.length() == 4)
				{
					ori = ori.substring(2,4) + ori.substring(0,2) ;
				}
				else 
				{
					ori = ori.substring(2,6) + ori.substring(0,2) ;
				}
				
			}
			else
			{
				return ori;
			}
		}
		return ori;
	}
	
	//��ȡһ���ַ����е�����15�����ϵ������ַ�
	public static String isExistAcc(String strIn)
	{
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		
		String strAccRet = "";
		int iCount = 0;
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				if((ch >= '0' && ch <= '9'))
				{
					iCount++;
					strAccRet += String.valueOf(ch);
				}
				else
				{
					if(iCount > 15)
						break;
					iCount = 0;
					strAccRet = "";
				}
			}
		}
		
		if(iCount > 15)
			return strAccRet;
		else
			return "";
	}
	
	//�жϴ�����ַ���(�����ո�)�Ƿ�ȫ��Ϊ����
	public static boolean judgeAllNumberic(String strIn)
	{
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		strIn = strIn.replaceAll(" ","");
		
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				if((ch >= '0' && ch <= '9'))
				{
					continue;
				}
				else
				{
					return false;
				}
			}
		}
		else
			return false;
		return true;
	}
	
	//�жϴ�����ַ����Ƿ�ȫΪ����
	public static boolean judgeAllChn(String strIn)
	{
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		strIn = strIn.replaceAll(" ","");
		
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				 if( ch <= 0 || ch >= 126)
				 {
					 continue;
				 }
				 else
					 return false;
			}
			return true;
		}
		else
			return false;
	}	
	
	//�жϴ�����ַ����Ƿ�Ϊ���ֻ�������(ȫ����,ȫ����,����+����)
	public static boolean judgeChnCode(String strIn)
	{
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		strIn = strIn.replaceAll(" ","");
		
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				if((ch >= '0' && ch <= '9') || (ch <= 0 || ch >= 126))
				{
					continue;
				}
				else
				{
					return false;
				}
			}
		}
		else
			return false;
		return true;
	}
	
	//�жϴ�����ַ����Ƿ��������
	public static boolean judgeExistChn(String strIn)
	{
		if(judgeChnCode(strIn))
		{
			return true;
		}
		
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		strIn = strIn.replaceAll(" ","");
		
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				 if( ch <= 0 || ch >= 126)
				 {
					 return true;
				 }
				 else
					 continue;
			}
			return false;
		}
		else
			return false;
	}
	
	//�жϴ�����ַ����Ƿ��������
	public static boolean judgeExistNumber(String strIn)
	{
		if(judgeChnCode(strIn))
		{
			return true;
		}
		
		strIn = strIn.replaceAll("\r\n","\n");
		strIn = strIn.replaceAll("\n","");
		strIn = strIn.replaceAll(" ","");
		
		if(strIn != null && strIn.length() > 0)
		{
			StringBuffer buff = new StringBuffer(strIn);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				 if( ch >= '0' && ch <= '9')
				 {
					 return true;
				 }
				 else
					 continue;
			}
			return false;
		}
		else
			return false;
	}


	//�ַ����Ƿ񸴺�ƥ�����--ʹ��������ʽ
	public static boolean chkString(String existStr,String value)
	{
		  Pattern pattern  = Pattern.compile(existStr);
		  Matcher matcher  = pattern.matcher(value);
		  boolean didMatch = matcher.matches();
		  return didMatch;
	}
	
	
	/**
	 * �ַ���matchStr���Ƿ����regexp���ַ���
	 * @param regexp
	 * @param mathStr
	 * @return
	 * zlh
	 */
	public static boolean isExist_Str(String regexp,String mathStr){		
		boolean result=false;
		Pattern pattern=Pattern.compile(regexp);
		Matcher matcher=pattern.matcher(mathStr);
		result = matcher.find();		
		return result;
	}
	
/**
 * ��ȡһ���ַ����е����������ַ�
 * @param numStr 
 * @param count
 * @return
 */
	public static String getSeqNumber(String numStr)
	{	
		numStr = numStr.replaceAll("\r\n","\n");
		numStr = numStr.replaceAll("\n","");	
		
		String seqNumRet = "";
		int iCount = 0;
		if(numStr != null && numStr.length() > 0)
		{
			StringBuffer buff = new StringBuffer(numStr);
			int len = buff.length();
			for (int i = 0; i < len;i++) 
			{
				char ch = buff.charAt(i);
				if((ch >= '0' && ch <= '9'))
				{
					iCount++;
					seqNumRet += String.valueOf(ch);
				}
				else
				{
					
					if(iCount > 10 && !(ch >= '0' && ch <= '9'))
						break;
					iCount = 0;
					seqNumRet = "";
				}
			}
		}
		
		
		return seqNumRet;
		
	}
	
	/**
	 * �ṩ��ȷ��С��λ�������봦��
	 * 
	 * @param v
	 *            ��Ҫ�������������
	 * @param scale
	 *            С���������λ
	 * @return ���������Ľ��
	 */
	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException(
			"����scale�����Ǵ���0������");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
     * �����ָ���ַ�
     * @param str	�ַ���
     * @param ch	����ַ�
     * @param len	�����ַ����ܳ���
     * @return
     */
    public static String rfillCharater(String str , char ch , int len)
    {
    	StringBuffer fillStr = new StringBuffer(str);
    	int fillLen = len - fillStr.length();
    	
    	for(int i = 0 ; i < fillLen ; i++) {
    		fillStr.append(ch);
    	}
    	
    	return fillStr.toString();
    }
    
    /**
     * �����ָ���ַ�
     * @param str	�ַ���
     * @param ch	����ַ�
     * @param len	�����ַ����ܳ���
     * @return
     */
    public static String lfillCharater(String str , char ch , int len)
    {
    	StringBuffer fillStr = new StringBuffer();
    	int fillLen = len - str.length();
    	
    	for(int i = 0 ; i < fillLen ; i++) {
    		fillStr.append(ch);
    	}
    	fillStr.append(str);
    	
    	return fillStr.toString();
    }
    
	/**
	 * ���ݷָ��,�ָ��ַ���,����List����
	 * @param strContents
	 *            String ��ȡ�ַ���
	 * @param sign
	 *            String �ָ���
	 * @return List ȡ�õ��ַ����б�
	 * 
	 * @author wang.zx
	 */
	public static List strSplitToList(String str, String sign) {
		List tempArrList = new ArrayList();

		try {
			StringTokenizer st = new java.util.StringTokenizer(str.trim(), sign);
			while (st.hasMoreTokens()) {
				tempArrList.add(st.nextToken());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return tempArrList;
	}
	/**
	 * ������ʽ
	 * 
	 * @param regexPattern  
	 *            ����  ����:"^\\-?\\d+\\.?\\d*$"
	 *            ������"[0-9]+";
	 * @param value
	 *            У��ֵ
	 * @return
	 * 
	 * @author wang.zx
	 */
	public static boolean propRule(String regexPattern, String value) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(value);
		boolean didMatch = matcher.matches();
		return didMatch;
	}
	
	/**
	 * str�Ƿ����strarray�е�Ԫ��
	 * @param str
	 * @param strarray
	 * @author wang.zx
	 * @return
	 */
	public static boolean isExistStr(String str,String[] strarray){
		if (strarray==null || strarray.length<=0) return false;
    	for (int i=0;i<strarray.length;i++)	
    	{
    		if (strarray[i]==null)
    		{
    			if (str==null) return true;
    			else continue;	
    		} 
    		if (str.indexOf(strarray[i].trim())!=-1)
    		{
    			return true;	
    		}	
    	}
    	return false;
	}
	/**
	 * �Ľ������黻��
	 * @param str
	 * @return
	 */
	public static String codeToLines(String str){
		String strTemp ="";
		if(str==null){
			return strTemp;
		}
		while(str.length()>19){
 			strTemp =strTemp+"\n"+str.substring(0,19);
 			if(' '==str.charAt(19)){
 				str = str.substring(20);
 			}else{
 				str = str.substring(19);
 			}
		}
		strTemp = strTemp+"\n"+str;
		strTemp = strTemp.substring(1);
		return strTemp;
	}
	/**
	 * �ַ�����λ����
	 * @param str
	 * @return
	 */
	public static String nameToLines(String str){
		String strTemp ="";
		if(str==null){
			return strTemp;
		}
		while(str.length()>8){
 			strTemp =strTemp+"<br>"+str.substring(0,8);
			str = str.substring(8);
		}
		strTemp = strTemp+"<br>"+str;
		strTemp = strTemp.substring(4);
		return strTemp;
	}
	
	public static String lowerToUppser(String str){
		str = str.trim();
		String strTemp = "";
		char a;
		if(str == null || str.trim().length()==0){
			return strTemp;
		}
		for(int i=0; i<str.length();i++){
			a = str.charAt(i);
			if(a >=97 && a<=122){
				a = (char)(a-32);
			}
			strTemp = strTemp + a;
		}
		return strTemp;
	}	
	/**
	 * ����ַ����е�����
	 * @param str
	 * @return
	 */
	public static String getDomain(String str){
		String strTemp ="";
		if(str==null){
			return strTemp;
		}
		int i = str.indexOf("http://");
		if(i >= 0)
		{
			strTemp = str.substring(i + 7);
		}
		i = str.indexOf("www.");
		if(i >= 0)
		{
			strTemp = strTemp.substring(i + 4);
		}		
		i = str.indexOf('/');
		if(i >=0)
		{
			strTemp = strTemp.substring(0,i);
		}		
		return strTemp;
	}
	
	  /**
     * �ж��ַ����Ƿ����
     * @param str
     * @return
     */
    public static boolean isExist(String str) {
        if (str != null && str.length() > 0) { 
            return true;
        } 
        return false;
    }
    
    /**
     * �ж��Ƿ�������
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        //��֤���֣�^[0-9]*$
        return str.matches("^\\d+(\\,\\d+)*$");
    }
    
    /**
     * ��֤���� yyyy-MM-dd
     * @param dateStr
     * @return
     */
    public static boolean isValidDate(String dateStr) {
        boolean isValid = false;
        if (dateStr == null || dateStr.length() <= 0) {
            return false;
        }
        String pattern = "yyyy-MM-dd";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String date = sdf.format(sdf.parse(dateStr));
            if (date.equalsIgnoreCase(dateStr)) {
                isValid = true;
            }
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }
    
    /**
     * ��֤���ڸ�ʽ�Ƿ��� yyyy-MM-dd HH:mm:ss
     * @param dateStr
     * @return
     */
    public static boolean isValidDateTime(String dateStr) {
        boolean isValid = false;
        if (dateStr == null || dateStr.length() <= 0) {
            return false;
        }
        String pattern = "yyyy-MM-dd HH:mm:ss";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String date = sdf.format(sdf.parse(dateStr));
            if (date.equalsIgnoreCase(dateStr)) {
                isValid = true;
            }
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }
    
    public static String joinStr(String[] array,String joinChar){
    	if(array==null)
    	return "";
    	if(joinChar==null)joinChar=",";
    	String str="";
    	for(int i=0;i<array.length;i++){
    		str=str+array[i];
    		if(i<array.length-1)str=str+joinChar;
    	}
    	return str;
    }
}
