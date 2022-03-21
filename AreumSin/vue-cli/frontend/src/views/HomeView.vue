<template>
  <div class="app">
      <router-link :to="{ name: 'HomeView' }">
        Home
      </router-link>
      <router-link :to="{ name: 'TestView' }">
        Test
      </router-link>
      <router-link :to="{ name: 'BoardListPage' }">
        BoardListPage
      </router-link>
      <router-link :to="{ name: 'Concave' }">
        &nbsp;이것이 삼목이닷!&nbsp;
      </router-link>
      <router-link style="text-decoration: none;" :to="{ name: 'EventBusTestPage' }">
        &nbsp;eventbus&nbsp;
      </router-link>
      <router-link style="text-decoration: none;" :to="{ name: 'ProductBoardListPage' }">
        &nbsp;상품게시판(문제은행13번)&nbsp;
      </router-link>
      <router-link style="text-decoration: none;" :to="{ name: 'CoverFlowTestPage' }">
        &nbsp;CoverFlowTestPage UI Test&nbsp;
      </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'AwesomeSwiperTestPage' }">
      &nbsp;AwesomeSwiperTestPage
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'ImageGalleryTestPage' }">
      &nbsp;ImageGalleryTestPage
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'CalendarTestPage' }">
      &nbsp;CalendarTestPage
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'VueFileUploadTestPage' }">
      &nbsp;VueFileUploadTestPage
    </router-link>

    <router-link style="text-decoration: none;" :to="{ name: 'VuetifyMemberRegisterPage' }">
      &nbsp;VuetifyMemberRegisterPage
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'VuetifyMemberJoinColumnTestPage' }">
      &nbsp;Vuetify Member Join Column Test&nbsp;
    </router-link>

  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'
export default {
  name: 'HomeView',
  components: {
  }
}
</script>