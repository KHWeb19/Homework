function jsMapTest(){
    console.log("JavaScript Map Test");

    let map = new Map();

    console.log("map: "+map);

    let map2 = new Map([["Apple", "green"], ["Banana", "yellow"]])

    console.log("map2: "+ map2);
    console.log("map2 size: "+ map2.size);

    console.log("map.get('test1'): "+map2.get("test1"));
    console.log("map.get('Banana'): "+map2.get("Banana"));
    console.log("map.get('test2'): "+map2.get("test2"));
    console.log("map.get('Apple'): "+map2.get("Apple"));

    map2.delete("Apple");
    console.log("map.get('Apple'): "+map2.get("Apple"));

    map2.clear();
    console.log("map.get('Banana'): "+map2.get("Banana"));

    let map3 = new Map([["Apple", "green"], ["Banana", "yellow"]])

    let keyIter = map3.keys();

    for(let key of keyIter){
        console.log("key: "+ key);
    }

    let valueIter = map3.values();

    for(let value of valueIter){
        console.log("value: "+value);
    }

    let entryIter = map3.entries();

    for (let entry of entryIter){
        console.log("entry: "+entry);
    }

    map3.forEach((function (value, key){
        console.log(key+ " : "+value);
    }))
}