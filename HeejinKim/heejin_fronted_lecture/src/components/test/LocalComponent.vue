<template>
    <div>
        {{ num }}
    </div>    
</template>

<script>

export default {

    name: 'LocalComponent',
    props: {
        num: Number //int를 쓰는게 아니라 자바스크립트,vue에서는 Number라고 씀(Biginteger제외하고)
    }
    
}
</script>