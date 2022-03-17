<template>
    <div>
        <coverflow :coverList="coverList" :coverWidth="500" :index="2"/> 
        <!-- index는 메인으로 나오는 사진말고 나머지 뒤에 남아있는것들인거같음, 처음에만 적용-->
    </div>
</template>

<script>

import coverflow from 'vue-coverflow'

export default {
    name: 'CoverflowTestPage',
    data () {
        return {
            coverList: [
                {
                    cover: require('@/assets/img/akmu.gif'), //gif도 된다!
                    title: '움짤'
                },
                {
                    cover: 'https://cdn.kbmaeil.com/news/photo/202101/867040_872793_634.jpg',
                    title: '에일리언'
                },
                {
                    cover: require('@/assets/img/akmu2.jpg'),
                    title: '사진'
                }
                
            ]
        }
    },
    components: {
        coverflow
    }
}

</script>

