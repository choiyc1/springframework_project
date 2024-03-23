package io.namoosori.travelclub.spring.store.mapstore;

import io.namoosori.travelclub.spring.aggregate.club.TravelClub;
import io.namoosori.travelclub.spring.store.ClubStore;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClubMapStore implements ClubStore {

    private Map<String, TravelClub> clubMap;

    public ClubMapStore(){//생성자 정의
        this.clubMap = new LinkedHashMap<>();//linked hashmap 을 인스턴스화
    }
    @Override
    public String create(TravelClub club) {//create 가 되면 이 파라미터로 새로 생성히햐되는 클럽 정보 온다.
        clubMap.put(club.getId(), club);//key: club id
        return club.getId();
    }

    @Override
    public TravelClub retrieve(String clubId) {//하나의 클럽 찾기
        return clubMap.get(clubId);
    }

    @Override
    public List<TravelClub> retrieveByName(String name) {//파라미터로 클럽 이름 오고, 동일한 이름의 클럽은 모두 반환한다.
        return clubMap.values().stream()//club map 에서 value 들의 컬랙션을 얻어서 스트링을 얻어오고
                .filter( club -> club.getName().equals(name))//필터 메소드를 통해서 클럽의 이름으로 필터하는 람다식을 제공하고
                .collect(Collectors.toList());//그런 결과를 컬렉팅서 리스트로 변환한 컬랙팅으로 변화
    }
    @Override
    public void update(TravelClub club) {//업데이트된 데이터로 세팅이 되서 넘어온다.
        clubMap.put(club.getId(),club);
    }

    @Override
    public void delete(String clubId) {
        clubMap.remove(clubId);
    }

    @Override
    public boolean exists(String clubId) {//해당 클럽 아이디를 가지고 있는지.
        //return clubMap.containsKey(clubId);
        return Optional.ofNullable(clubMap.get(clubId)).isPresent();
    }//ClubStore 의 추상 메소드들을 재정의해야된ㄷ.
}
