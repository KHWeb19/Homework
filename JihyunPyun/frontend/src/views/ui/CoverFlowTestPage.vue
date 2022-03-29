<template>
    <div>
        <coverflow :coverList="coverList" :coverWidth="280" :index="2"/>
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
                    cover: 'http://image.auction.co.kr/itemimage/1a/12/2d/1a122d1d06.jpg',
                    title: '아이스 아메리카노'
                },
               {
                    cover: 'http://gdimg.gmarket.co.kr/1760192382/still/600?ver=1583222658',
                    title: '아이스 라떼'
               },
               {
                     cover: 'https://2.gall-img.com/hygall/files/attach/images/82/313/522/385/c6e32ef43145a92f42636fe993d6141c.jpg',
                     title: '녹차'
               },
               {
                     cover: 'http://photo3.enuri.info/data/images/service/middle/2202000/2202347.jpg',
                     title: '초코'
               },
               {
                     cover: 'http://gdimg.gmarket.co.kr/2245765049/still/600?ver=1635125781',
                     title: '캐모마일'
               }
            ]
        }
    },
    components: {
        coverflow
    }
}

</script>