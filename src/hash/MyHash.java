package hash;

public class MyHash {
    public Slot[] hashTable;    // 해쉬 테이블을 담는 공간

    public MyHash(Integer size){    // 해쉬 테이블의 크기를 정하는 함수
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){     // 생성자
            this.value = value;
        }
    }

    public Integer hashFunction(String key){
        return (int)(key.charAt(0) % this.hashTable.length); //  해시 테이블의 길이의 맞는 key 값을 반환
    }

    public boolean saveData(String key , String value){
        Integer address = this.hashFunction(key);   // 위에 선언한 해시 function을 통해 key를 가져오고
        if (this.hashTable[address] != null){       // key에 해당하는 value가 존재하지 않은 경우
            this.hashTable[address].value = value;  // 기존의 값을 변경
        }else{                                      // key에 해당하는 value가 존재하는 경우
            this.hashTable[address] = new Slot(value);  // 새로운 값을 추가
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunction(key);
        if(this.hashTable[address]!= null){
            return this.hashTable[address].value;   // 현재 존재하는 해쉬 테이블의 값을 리턴
        }else{
            return null;
        }
    }

}
