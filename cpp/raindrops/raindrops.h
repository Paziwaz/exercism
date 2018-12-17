#ifndef RAINDROPS_RAINDROPS_H
#define RAINDROPS_RAINDROPS_H

#include <sstream>

namespace raindrops{
     inline std::string convert(int value){
        std::ostringstream result;
        if (value % 3 == 0)
            result << "Pling";
        if (value % 5 == 0)
            result <<"Plang";
        if (value % 7 == 0)
            result << "Plong";
        if (!result.tellp())
            result << value;
        return result.str();
    }
}

#endif
