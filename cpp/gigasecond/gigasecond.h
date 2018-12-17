#if !defined(GIGASECOND_H)
#define GIGASECOND_H
#include "boost/date_time/posix_time/posix_time.hpp"

namespace gigasecond{
  boost::posix_time::ptime advance(boost::posix_time::ptime pt1){
    return pt1 + boost::posix_time::seconds(1000000000);
  }
}

#endif
