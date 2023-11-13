. implement put/get/putAll hashmap at constant time

  class Node{
    int version;
    int val;
    }
class CustomMap {

int version;
HashMap<Integer,Integer> versionMap;
HashMap<Integer,Node> map;
pubic CustomMap()
{
	version=0;
	versionMap=new HashMap<Integer,Integer>();
	map = new HashMap<Integer,Node>();
}
public void set(int key, int value) {
     map.put(key, new Node(version,value));
}

public Integer get(int key) {
     if(!map.containsKey(key))
		return null;
	Node node = map.get(key);
	if(node.version<version)
		return versionMap.get(version);
	return node.val;
}

public void setAll(int value) {
	version++;
	versionMap.put(version,value);
}
