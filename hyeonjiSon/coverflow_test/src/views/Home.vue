<template>
    <coverflow :coverList="coverList" :coverWidth="260" :index="2"/>
</template>

<script>

import coverflow from 'vue-coverflow'

export default {
    name: 'Home',
    data () {
        return {
            coverList: [
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                },
                {
                    cover: require('@/assets/logo.png'),
                    title: 'logo'
                }
            ]
        }
    },
    components: {
        coverflow
    }
}

</script>