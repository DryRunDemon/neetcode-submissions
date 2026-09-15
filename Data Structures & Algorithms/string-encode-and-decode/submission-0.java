class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedstr=new StringBuilder();
        for (String str: strs){
            encodedstr.append(str.length()).append("#").append(str);
        }
return encodedstr.toString();
    }

    public List<String> decode(String str) {
                List<String>list=new ArrayList<>();
int i=0;
while(i<str.length()){
    int j=i;
    while(str.charAt(j)!='#'){
        j++;
    }
    int length=Integer.parseInt(str.substring(i,j));
    String s=str.substring(j+1,j+1+length);
    list.add(s);
    i=j+1+length;
}
return list;
    }
}
