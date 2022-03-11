<template>
  <div class="home">
      <router-link :to="{ name: 'Home' }">
            &nbsp;Home&nbsp;
        </router-link>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
  }
}
</script>



<!--
여태까지 Vue 와 Spring 을 연동하여 게시판을 만드는 방법에 대해 학습하였습니다.
이를 응용하여 상품과 관련한 상품 페이지를 만들어보도록 합니다.
-->