<template>
  <div class="home">
        <div id="header">
            <router-link style="text-decoration: none;" :to="{ name: 'HomeView' }">
                &nbsp;Home&nbsp;
            </router-link>
            
            <router-link style="text-decoration: none;" :to="{ name: 'ProductListPage' }">
                &nbsp;BoardListPage&nbsp;
            </router-link>
            
            <router-link style="text-decoration: none;" :to="{ name: 'EventBusTestPage' }">
                &nbsp;이것이 eventbus닷!&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'VuetifyAllInOneTestPage' }">
                &nbsp;Vuetify(뷰티파이) UI Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'VuetifyImageTestPage' }">
                &nbsp;Vuetify Image Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'CovorFlowTestPage' }">
                &nbsp;Covor Flow Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'AwesomeSwiperTestPage' }">
                &nbsp;Awesome Swiper Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'ImageGalleryTestPage' }">
                &nbsp;Image Gallery Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'CalendarTestPage' }">
                &nbsp;Calendar Test&nbsp;
            </router-link>
            <router-link style="text-decoration: none;" :to="{ name: 'VueFileUploadPage' }">
                &nbsp;File Upload Test&nbsp;
            </router-link>
        </div>
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