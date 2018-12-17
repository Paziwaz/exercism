#ifndef GRAINS_GRAINS_H
#define GRAINS_GRAINS_H

#include <cstdint>
#include <cassert>

namespace grains
{
    int64_t result = 1;
    int64_t square( int8_t square ){
        assert( square > 0 && square <= 64 );
        return result << ( square - 1 );
    }
    uint64_t total( ){
        return UINT64_MAX;
    }
}

#endif
