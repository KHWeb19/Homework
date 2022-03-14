<template>
    <div id="market">
        <h2> Market 게시판 </h2>
        <router-link :to="{ name: 'MarketRegisterPage' }">
        </router-link>
        <market-list :markets="markets"/>
    </div>
</template>

<script>

import MarketList from '@/components/market/MarketList.vue'
import { mapState, mapActions } from 'vuex'
//store의 action에 있는 fetchBoardList와 맵핑해라

export default {
    name: 'MarketListPage',
    components: {
        MarketList
    },
    computed: {
        ...mapState(['markets'])
        //State에 있는 market값을 this랑 맵핑한다.
    },
    mounted(){ //부모, 자식 관계의 Component가 렌더링 될 때 created다음으로 호출
                //자식, 부모 순으로 실행.
                //el이 새로 생성된 vm.$el로 대체된 인스턴스가 마운트 된 직후 호출됨.(가상돔 조작이 가능)
        this.fetchMarketList()
    },
    methods: {
        ...mapActions(['fetchMarketList'])
                //MarketList내용 전체를 가져올 수 있는(호출) 메소드를 만든 것이다.
        //MarketBoardList가 하는 일: BoardList를 가져옴(state에 넘어온 정보를 저장)
    }

}
</script>