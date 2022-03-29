<!-- Component를 전역에서 관리할때 -->
<template>
  <div class="home">
    <div id="header">
      <router-link to="{ name: 'Home'}" class="nav-link" active-class="active">
        home
      </router-link>
      <br/>
      <router-link to="{ name: 'TestView'}" class="nav-link" active-class="active">
        테스트를 눌러봐!
      </router-link>
    </div>

    <h2>Vue 테스트 페이지</h2>

    <div id="app">
      <p>{{msg}}</p>

      <global-component v-bind:initial-test="counter"></global-component> <!-- counter가 v-bind: initial-test //GlobalComponet counter이랑 연결됨. -->
      <local-component v-bind:num="value"></local-component>
      <button v-on:click="plus">클릭하세요!!</button>
    </div>
  </div>

  <!--

    String => 문자열 클래스
    ArrayList, Map => 컬랙션 계열의 라이브러리

    ArrayList 등을 만들어서 사용한것이 아니라 만들어놓은 라이브러리를 가져다가 사용했다.
    라이브러리를 만들어서 모두 쓸 수 있도록 하는게 global-component

    삼성폰, 아이폰 전세계 어디서든지 사용 global-component
    아이폰 결제는 가능한 나라만 가능 local-component

    ==> 내가 사용하게 필요한걸 만들겠어! = local-component!
    ==> 전 세계 사람들이 내가 만들걸 사용해서 편해졌으면 좋겠어 = global-component

   -->


</template>

<script>

import Vue  from "vue";
import GlobalComponent from "@/components/test/GlobalComponent.vue";
import LocalComponent from "@/components/test/LocalComponent";

Vue.component(GlobalComponent.name, GlobalComponent);

export default {
  components: {LocalComponent},
  data () {
    return {
      counter: 0,
      value: 0,
      msg: '이래서 Vue 좋아! ',
    }
  },
  methods :{
    plus(){
      this.value++;
    },
  }
}
</script>
