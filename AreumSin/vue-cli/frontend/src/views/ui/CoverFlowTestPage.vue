<template>
    <coverflow :coverList="coverList" ></coverflow>
</template>

<script>

import coverflow  from 'vue-coverflow'

export default {
  name: 'CoverFlowTestPage',
  data () {
    return {
      coverList: [
        {
          cover: require('@/assets/logo.png'),
          title: '듄'
        },
        {
          cover: require('@/assets/logo.png'),
          title: '마리오'
        },
        {
          cover: require('@/assets/img/test.png'),
          title: '마리오'
        }
      ]
    }
  },
  components: {
    coverflow
  }
}


</script>